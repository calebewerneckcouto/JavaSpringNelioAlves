package com.cwcdev.aula;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cwcdev"})
public class SpringNelioAlvesApplication implements CommandLineRunner {

    public static void main(String[] args) {


        SpringApplication.run(SpringNelioAlvesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Ola Mundo");

    }
}
