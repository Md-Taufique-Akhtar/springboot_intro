package com.scmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page handler");
        model.addAttribute("name", "Substring Technology");
        model.addAttribute("YoutubeChannel", "Dominator Circle");
        model.addAttribute("githubRepo", "https://github.com/Md-Taufique-Akhtar");
        return "home";
    }
}
