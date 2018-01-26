package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    // Some useless comment
    
    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    class TestController {

        @GetMapping("/info/{id}")
        public String generateInfo(@PathVariable("id") int id) {
            for (int i = 0; i < id; i++) {
                logger.info("This is an info message");
            }
            return "Generated " + id + "logs!";
        }

        @GetMapping("/error/{id}")
        public String generateError(@PathVariable("id") int id) {
            for (int i = 0; i < id; i++) {
                logger.error("This is an error message");
            }
            return "Generated " + id + "logs!";
        }

        @GetMapping("/debug/{id}")
        public String generateDebug(@PathVariable("id") int id) {
            for (int i = 0; i < id; i++) {
                logger.debug("This is an debug message");
            }
            return "Generated " + id + "logs!";
        }
    }
}
