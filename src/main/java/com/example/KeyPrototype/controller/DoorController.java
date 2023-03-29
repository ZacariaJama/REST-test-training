package com.example.KeyPrototype.controller;

import com.example.KeyPrototype.models.Door;
import com.example.KeyPrototype.repository.DoorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class DoorController {
    private DoorRepository doorRepository;

    public DoorController(DoorRepository doorRepository) {
        this.doorRepository = doorRepository;
    }

    @GetMapping(value = "/doors/{id}")
    public ResponseEntity<List<Door>> getBuildings(@PathVariable("id") String id) {
        List<Door> doors = doorRepository.findAllByBuildCode(id.toUpperCase());
        List<Door> doorList = doors.stream().toList();
        return ResponseEntity.ok(doorList);
    }
}
