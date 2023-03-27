package com.example.KeyPrototype.controller;

import com.example.KeyPrototype.repository.DoorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoorController {
    private DoorRepository doorRepository;

    public DoorController(DoorRepository doorRepository) {
        this.doorRepository = doorRepository;
    }

    @RequestMapping("/doors")
    public String getDoors(Model model) {
        model.addAttribute("doors", doorRepository.findAll());
        return "doors";
    }
}
