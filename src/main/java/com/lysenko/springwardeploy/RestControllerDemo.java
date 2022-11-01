package com.lysenko.springwardeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

    @GetMapping()
    public String hello() {
        return "rest hello without";
    }

    @GetMapping("/")
    public String helloWith() {
        return "rest hello with";
    }

    @GetMapping("/hello")
    public String helloWithSlash() {
        return "rest hello with slash";
    }
}
