package com.game.pokergame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("user-info")
    public String userInfo(Model model) {
        model.addAttribute("userDto", "<b>Yong Min Back</b>");
        return "user-info";
    }
}
