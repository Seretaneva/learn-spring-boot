package com.seretan.recipe_manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;

@RestController
public class Controller {
    @GetMapping("/hello/{username}")
    public String helloUser(@PathVariable String username) {
        Date date = Date.from(Instant.now());
        return date +  ":    hello " + username;
    }
}
