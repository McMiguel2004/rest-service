package com.example.restservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/player")
    public String getPlayerById(@RequestParam int id, Model model) {
        Player player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        return "player"; // Esto asume que tienes una plantilla Thymeleaf llamada "player.html"
    }
}
