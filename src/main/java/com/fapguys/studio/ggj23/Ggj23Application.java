package com.fapguys.studio.ggj23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.Map;

@SpringBootApplication
public class Ggj23Application {
    private static final Logger log = LoggerFactory.getLogger(Ggj23Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Ggj23Application.class, args);
    }

    @Bean
    public DataSource dataSource() {
        Map<String, String> env = System.getenv();
        String url = env.getOrDefault("POSTGRESQL_ADDON_URI", "jdbc:postgresql://localhost:5433/ggj23");
        log.info("url :" + url);
        String username = env.getOrDefault("POSTGRESQL_ADDON_USER", "postgres");
        log.info("username : " + username);
        String pass = env.getOrDefault("POSTGRESQL_ADDON_PASSWORD", "pass");
        log.info("pass : " + pass);
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url(url)
                .username(username)
                .password(pass)
                .build();
    }
}
