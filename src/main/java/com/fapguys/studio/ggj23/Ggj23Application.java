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
        String host = env.getOrDefault("POSTGRESQL_ADDON_HOST", "localhost");
        String port = env.getOrDefault("POSTGRESQL_ADDON_PORT", "5433");
        String base = env.getOrDefault("POSTGRESQL_ADDON_DB", "ggj23");
        String url = "jdbc:postgresql://" + host + ":" + port + "/" + base;
        log.info("url " + url);
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url(url)
                .username(env.getOrDefault("POSTGRESQL_ADDON_USER", "postgres"))
                .password(env.getOrDefault("POSTGRESQL_ADDON_PASSWORD", "pass"))
                .build();
    }
}
