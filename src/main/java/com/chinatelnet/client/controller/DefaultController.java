package com.chinatelnet.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
    @GetMapping({"/", ""})
    String welcome(Model model) {

        return "index";
    }
}
