package com.university.shophub.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String indexPage(Model model) { return "index"; }

    @RequestMapping("/admin/")
    public String adminPage(Model model) {
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/error")
    public String errorPage(Model model) {
        return "error";
    }
}
