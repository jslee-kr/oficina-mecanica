package com.fiap.oficina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OficinaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OficinaApplication.class, args);
    }
}