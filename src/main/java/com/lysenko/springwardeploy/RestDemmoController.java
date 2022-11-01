package com.lysenko.springwardeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemmoController {

    @GetMapping("/")
    public String helloFromRest() {
        return "Hello from Rest";
    }

    @GetMapping()
    public String helloFromRestWithout() {
        return "Hello from Rest without";
    }

    @GetMapping("/hellorest")
    public String helloFromRestWith() {
        return "Hello from Rest with";
    }
}
