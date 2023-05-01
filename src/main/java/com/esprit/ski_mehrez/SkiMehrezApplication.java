package com.esprit.ski_mehrez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SkiMehrezApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkiMehrezApplication.class, args);
    }

}
