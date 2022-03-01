package com.pedrozanon.chassi.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.pedrozanon.chassi"})
@EntityScan(basePackages = {"com.pedrozanon.chassi.h2"})
@EnableJpaRepositories(basePackages = {"com.pedrozanon.chassi.h2"})
public class GarageApplication {

    public static void main(String[] args) {

        SpringApplication.run(GarageApplication.class);
    }
}
