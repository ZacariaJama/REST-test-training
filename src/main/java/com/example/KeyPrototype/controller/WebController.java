package com.example.KeyPrototype.controller;

import com.example.KeyPrototype.service.BuildingService;
import com.example.KeyPrototype.service.DoorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    private final BuildingService buildingService;
    private final DoorService doorService;
    public WebController(BuildingService buildingService, DoorService doorService) {
        this.buildingService = buildingService;
        this.doorService = doorService;
    }

    @RequestMapping({"","/","index","index.html"})
    public String buildingList(Model model){
        model.addAttribute("owners", buildingService);
        return "owners/index";
    }
}
