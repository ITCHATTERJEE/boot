package com.app;

import org.springframework.boot.*;

import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
//@RestController
//@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("org.com.controller,com.app")
public class Launcher {
    /*@RequestMapping("/")
    String home() {
        return "Hello World!";
    }*/
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Launcher.class, args);
    }
}