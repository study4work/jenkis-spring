package com.lysenko.springwardeploy;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    Logger logger = LogManager.getLogger();

    @GetMapping("/demo")
    public String hello() {
        logger.log(Level.INFO, "TEST");
        return "hello";
    }

}
