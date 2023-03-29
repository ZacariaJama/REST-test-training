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
        Door door11 = new Door("Main Entrance", "UCC");
        Door door12 = new Door("1rst Floor Entrance", "UCC");
        Door door13 = new Door("2nd Floor Entrance", "UCC");
        door11.getBuildings().add(building1);
        building1.getDoors().add(door11);
        doorRepository.save(door11);
        door12.getBuildings().add(building1);
        building1.getDoors().add(door12);
        doorRepository.save(door12);
        door13.getBuildings().add(building1);
        building1.getDoors().add(door13);
        doorRepository.save(door13);

        buildingRepository.save(building1);

        Building building2 = new Building("ITS","Information Technology Services");
        Door door21 = new Door("2nd Floor Entrance", "ITS");
        Door door22 = new Door("Main Entrance", "ITS");
        door21.getBuildings().add(building2);
        building2.getDoors().add(door21);
        doorRepository.save(door21);
        door22.getBuildings().add(building2);
        building2.getDoors().add(door22);
        doorRepository.save(door22);

        buildingRepository.save(building2);

        Building building3 = new Building("TMC","Toldo Medical Center");
        Door door31 = new Door("Left Side Entrance", "TMC");
        Door door32 = new Door("3rd Floor Entrance", "TMC");
        Door door33 = new Door("2nd Floor Entrance", "TMC");
        Door door34 = new Door("Main Entrance", "TMC");
        Door door35 = new Door("3rd Floor Emergency Entrance", "TMC");
        door31.getBuildings().add(building3);
        building3.getDoors().add(door31);
        doorRepository.save(door31);
        door32.getBuildings().add(building3);
        building3.getDoors().add(door32);
        doorRepository.save(door32);
        door33.getBuildings().add(building3);
        building3.getDoors().add(door33);
        doorRepository.save(door33);
        door34.getBuildings().add(building3);
        building3.getDoors().add(door34);
        doorRepository.save(door34);
        door35.getBuildings().add(building3);
        building3.getDoors().add(door35);
        doorRepository.save(door35);

        buildingRepository.save(building3);

        Building building4 = new Building("CAW","Community Student Center");
        Door door41 = new Door("Right Entrance", "CAW");
        Door door42 = new Door("Left Entrance", "CAW");
        door41.getBuildings().add(building4);
        building4.getDoors().add(door41);
        doorRepository.save(door41);
        door42.getBuildings().add(building4);
        building4.getDoors().add(door42);
        doorRepository.save(door42);

        buildingRepository.save(building4);
    }
}
