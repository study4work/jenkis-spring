package com.lysenko.springwardeploy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/demo")
    public String hello() {
        return "hellwwwo";
    }



}
