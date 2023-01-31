package com.fapguys.studio.ggj23.gamer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GamerController {
    private static final Logger log = LoggerFactory.getLogger(GamerController.class);

    @Autowired
    private GamerRepository gamerRepository;

    @GetMapping("/gamers")
    public String gamers(Model model) {
        this.listUsers(model);
        model.addAttribute("gamer", new GamerData());
        return "gamers";
    }

    @PostMapping("/gamers")
    public String postGamer(@ModelAttribute("gamer") GamerData data, Model model) {
        Object gamer = model.getAttribute("gamer");
        log.info("gamer data {}", gamer);
        log.info("gamer data {}", data.getUsername());
        GamerData response = new GamerData();

        if (data.getUsername().isEmpty()) {
            response.setMessage("Nom d'utilisateur invalide");
        } else {
            gamerRepository.save(new Gamer(data.getUsername()));
            response.setMessage("Utilisateur créé");
        }
        model.addAttribute("gamer", response);
        this.listUsers(model);

        return "gamers";
    }

    private void listUsers(Model model) {
        List<Gamer> gamers = gamerRepository.findAll();
        long count = gamerRepository.count();
        model.addAttribute("gamers", gamers);
        model.addAttribute("count", count);
    }
}
