package com.example.KeyPrototype.service;

import com.example.KeyPrototype.models.Building;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class BuildingService {
    protected Map<Building, String> map = new HashMap<>();

    Set<String> findAll(){
        return new HashSet<>(map.values());
    }

    String findById(Building id) {
        return map.get(id);
    }

    Building save(Building object) {
        map.put(object, object.getBuildCode());
        return object;
    }

    void deleteById(Building id){
        map.remove(id);
    }

    void delete(String object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
