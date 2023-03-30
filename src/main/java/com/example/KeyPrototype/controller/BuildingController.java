package com.example.KeyPrototype.controller;

import com.example.KeyPrototype.models.Building;
import com.example.KeyPrototype.repository.BuildingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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