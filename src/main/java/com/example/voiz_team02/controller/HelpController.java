package com.example.voiz_team02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/help")
public class HelpController {
    @GetMapping
    public String showHelp(){
        return "help";
    }
}
