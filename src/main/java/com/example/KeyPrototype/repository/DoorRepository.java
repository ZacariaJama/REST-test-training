package com.example.KeyPrototype.repository;

import com.example.KeyPrototype.models.Door;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoorRepository extends CrudRepository<Door, String> {
}
