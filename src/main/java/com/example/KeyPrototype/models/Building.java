package com.example.KeyPrototype.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Building {

    @Id
    private String buildCode;
    private String buildName;

    @OneToMany(mappedBy = "buildings")
    @JsonIgnore
    private Set<Door> doors = new HashSet<>();

    public Building(String buildCode, String buildName){
        this.buildCode = buildCode;
        this.buildName = buildName;
    }
    public Building() {
    }

    public void setBuildCode(String buildCode) {
        this.buildCode = buildCode;
    }
    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getBuildCode() {
        return buildCode;
    }
    public String getBuildName() {
        return buildName;
    }

    public Set<Door> getDoors() {
        return doors;
    }

    public void setDoors(Set<Door> doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildCode='" + buildCode + '\'' +
                ", buildName='" + buildName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Building building = (Building) o;

        if (!Objects.equals(buildCode, building.buildCode)) return false;
        return Objects.equals(buildName, building.buildName);
    }

    @Override
    public int hashCode() {
        int result = buildCode != null ? buildCode.hashCode() : 0;
        result = 31 * result + (buildName != null ? buildName.hashCode() : 0);
        return result;
    }
}
