package com.fapguys.studio.ggj23.index;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController implements ErrorController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/error")
    public String error(){
        return "index";
    }
}
