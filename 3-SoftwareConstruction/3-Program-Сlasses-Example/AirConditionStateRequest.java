package com.lab9.airstatechecker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "airconditionstaterequest")
public class AirConditionStateRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "location")
    private String location;
    @Column(name = "request_type")
    private String requestType;
    @Column(name = "info")
    private String info;
    @OneToOne
    @JoinColumn(name = "userno")
    private User user;

    public AirConditionStateRequest(String location, String requestType, String info, User user) {
        this.location = location;
        this.requestType = requestType;
        this.info = info;
        this.user = user;
    }

    public AirConditionStateRequest() {

    }

    @Override
    public String toString() {
        return "AirConditionStateRequest{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", requestType='" + requestType + '\'' +
                ", info='" + info + '\'' +
                ", user=" + user +
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

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
