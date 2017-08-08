package com.idibros.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dongba on 2017-08-07.
 */
@Controller
public class WebStarterController {

    @RequestMapping(value = "/index")
    public String index (@RequestParam(value = "name", required = false, defaultValue = "World")String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @PostMapping(value = "/postAction")
    public String postAction(@RequestParam(value = "actionValue", required = false, defaultValue = "")String actionValue, Model model) {
        model.addAttribute("actionValue", actionValue);
        return "postAction";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }
}
