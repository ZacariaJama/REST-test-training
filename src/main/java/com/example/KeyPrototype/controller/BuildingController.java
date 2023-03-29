package com.example.KeyPrototype.controller;

import com.example.KeyPrototype.models.Building;
import com.example.KeyPrototype.repository.BuildingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BuildingController {
    private BuildingRepository buildingRepository;

    public BuildingController(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    @GetMapping("/buildings/")
    ResponseEntity<List<Building>> getBuildings() {
        Iterable<Building> buildings = buildingRepository.findAll();
        return ResponseEntity.ok((List<Building>) buildings);
    }
}