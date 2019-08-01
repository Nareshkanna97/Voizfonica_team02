package com.example.voiz_team02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/success")
public class SuccessController {
    @GetMapping
    public String show(Model model){
        return "success";
    }
}
