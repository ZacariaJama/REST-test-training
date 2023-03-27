package com.example.KeyPrototype.controller;

import com.example.KeyPrototype.repository.BuildingRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuildingController {
    private BuildingRepository buildingRepository;

    public BuildingController(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    @RequestMapping("/buildings")
    public String getBuilding(Model model) {
        model.addAttribute("buildings", buildingRepository.findAll());
        return "buildings";
    }
}
