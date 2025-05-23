package com.api.eletronx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotsController {

    @GetMapping(value = "/robots.txt", produces = "text/plain")
    public String robots() {
        return """
                User-agent: *
                Disallow:

                Sitemap: https://eletronx.com/sitemap.xml
                """;
    }
}