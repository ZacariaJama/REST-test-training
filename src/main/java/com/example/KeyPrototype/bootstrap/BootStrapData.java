package com.example.KeyPrototype.bootstrap;

import com.example.KeyPrototype.models.Building;
import com.example.KeyPrototype.models.Door;
import com.example.KeyPrototype.repository.BuildingRepository;
import com.example.KeyPrototype.repository.DoorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final BuildingRepository buildingRepository;
    private final DoorRepository doorRepository;

    public BootStrapData(BuildingRepository buildingRepository, DoorRepository doorRepository){
        this.buildingRepository = buildingRepository;
        this.doorRepository = doorRepository;
    }

    @Override
    public void run(String... args) throws HttpMessageNotWritableException {
        Building building1 = new Building("UCC","University Computer Center");
        Door door1 = new Door("Main Entrance", "UCC");
        door1.getBuildings().add(building1);
        building1.getDoors().add(door1);
        doorRepository.save(door1);
        buildingRepository.save(building1);

        Building building2 = new Building("ITS","Information Technology Services");
        Door door2 = new Door("2nd Floor Entrance", "ITS");
        Door door4 = new Door("Main Entrance", "ITS");
        door2.getBuildings().add(building2);
        building2.getDoors().add(door2);
        building2.getDoors().add(door4);
        doorRepository.save(door2);
        doorRepository.save(door4);
        buildingRepository.save(building2);

        Building building3 = new Building("TMC","Toldo Medical Center");
        Door door3 = new Door("Left Side Entrance", "TMC");
        door3.getBuildings().add(building3);
        building3.getDoors().add(door3);
        doorRepository.save(door3);
        buildingRepository.save(building3);

        //door2.getBuildings().add(building1);
        //door3.getBuildings().add(building1);
        //building1.getDoors().add(door2);
        //building1.getDoors().add(door3);

        //doorRepository.save(door2);
        //doorRepository.save(door3);
    }

    /*
        server.port=8080
        spring.h2.console.enabled=true
        spring.security.user.name=user
        spring.security.user.password=password
        spring.security.user.roles=manager
     */
}
