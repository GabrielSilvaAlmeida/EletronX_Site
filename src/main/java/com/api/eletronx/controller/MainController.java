package com.api.eletronx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class MainController {
    
    @GetMapping("/")
    public String homePage() {
        return "home";
    }
    
    @GetMapping("/home")
    public String retornarHome() {
        return "home";
    }
    @GetMapping("/termos")
    public String termosPage() {
        return "termos";
    }

    @GetMapping("/apresentacao")
    public String apresentacaoPage() {
        return "apresentacao";
    }
    
    @GetMapping("/loja")
    public String lojaPage() {
        return "produtos";
    }
    
    
}
