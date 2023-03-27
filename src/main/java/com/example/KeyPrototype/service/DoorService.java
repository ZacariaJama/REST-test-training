package com.example.KeyPrototype.service;

import com.example.KeyPrototype.models.Door;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class DoorService {
    protected Map<Door, String> map = new HashMap<>();

    Set<String> findAll(){
        return new HashSet<>(map.values());
    }

    String findById(Door id) {
        return map.get(id);
    }

    Door save(Door object) {
        map.put(object, object.getId());
        return object;
    }

    void deleteById(Door id){
        map.remove(id);
    }

    void delete(String object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}
