package com.example.KeyPrototype.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Door {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String doorName;
    private String buildCode;

    @ManyToOne
    @JsonIgnore
    private Building buildings;

    public Door(String doorName, String buildCode) {
        this.doorName = doorName;
        this.buildCode = buildCode;
    }
    public Door() {
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setDoorName(String doorName) {
        this.doorName = doorName;
    }
    public void setBuildCode(String buildCode) {
        this.buildCode = buildCode;
    }
    public void setBuildings(Building buildings) {
        this.buildings = buildings;
    }

    public Long getId() {
        return id;
    }
    public String getDoorName() {
        return doorName;
    }
    public String getBuildCode() {
        return buildCode;
    }
    public Building getBuildings() {
        return buildings;
    }

    @Override
    public String toString() {
        return "Door{" +
                "id=" + id +
                ", doorName='" + doorName + '\'' +
                ", buildCode='" + buildCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Door door = (Door) o;

        if (!Objects.equals(id, door.id)) return false;
        if (!Objects.equals(doorName, door.doorName)) return false;
        return Objects.equals(buildCode, door.buildCode);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (doorName != null ? doorName.hashCode() : 0);
        result = 31 * result + (buildCode != null ? buildCode.hashCode() : 0);
        return result;
    }
}
