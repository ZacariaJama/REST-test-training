package com.example.KeyPrototype.controller;

import com.example.KeyPrototype.models.Building;
import com.example.KeyPrototype.models.Door;
import com.example.KeyPrototype.repository.DoorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @GetMapping("/doors/")
    ResponseEntity<List<Door>> getBuildings() {
        Iterable<Door> doors = doorRepository.findAll();
        return ResponseEntity.ok((List<Door>) doors);
    }
}
