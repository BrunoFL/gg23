package com.fapguys.studio.ggj23;

import com.fapguys.studio.ggj23.model.User;
import com.fapguys.studio.ggj23.model.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ggj23Application {
	private static final Logger log = LoggerFactory.getLogger(Ggj23Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Ggj23Application.class, args);
	}


}
