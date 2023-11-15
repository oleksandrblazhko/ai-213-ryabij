package com.lab9.airstatechecker.entity;

import jakarta.persistence.*;

@Entity
public class EFreshAir {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "location")
    private String location;
    @Column(name = "air_condition_state")
    private String airConditionState;
    //method
    public String getAirStateInfo(String user, String location) {
        String result = "";
        if (location.length() > 20 || !user.matches("^[a-zA-Z\\s]+$") || user.isBlank()) {
            result = "-1";
        }
        result = """
                    The city of New York today has excellent air quality.
                                The level of air pollution at the moment meets
                                all norms and safety standards.
                                Citizens can enjoy fresh air and safe living conditions
                                Temperature in the city is 24C
                    """;
        return result;
    }

    public EFreshAir(String location, String airConditionState) {
        this.location = location;
        this.airConditionState = airConditionState;
    }

    public EFreshAir() {

    }

    @Override
    public String toString() {
        return "EFreshAir{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", airConditionState='" + airConditionState + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAirConditionState() {
        return airConditionState;
    }

    public void setAirConditionState(String airConditionState) {
        this.airConditionState = airConditionState;
    }
}
