package com.example.KeyPrototype.repository;

import com.example.KeyPrototype.models.Door;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoorRepository extends CrudRepository<Door, Long> {
    List<Door> findAllByBuildCode(String code);
}
