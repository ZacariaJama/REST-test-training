package com.example.KeyPrototype.repository;

import com.example.KeyPrototype.models.Building;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends CrudRepository<Building, String> {
}
