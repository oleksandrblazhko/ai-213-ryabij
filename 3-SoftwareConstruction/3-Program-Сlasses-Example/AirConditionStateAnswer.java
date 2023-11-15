package com.lab9.airstatechecker.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "airconditionstateanswer")
public class AirConditionStateAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "answer_title")
    private String answerTitle;
    @Column(name = "info")
    private String info;
    @Column(name = "date")
    private LocalDate date;
    @OneToOne
    @JoinColumn(name = "air_condition_state_requestno")
    private AirConditionStateRequest airConditionStateRequest;
    @OneToOne
    @JoinColumn(name = "efresh_airno")
    private EFreshAir eFreshAir;

    public AirConditionStateAnswer(String answerTitle, String info, LocalDate date, AirConditionStateRequest airConditionStateRequest, EFreshAir eFreshAir) {
        this.answerTitle = answerTitle;
        this.info = info;
        this.date = date;
        this.airConditionStateRequest = airConditionStateRequest;
        this.eFreshAir = eFreshAir;
    }

    public AirConditionStateAnswer() {

    }

    @Override
    public String toString() {
        return "AirConditionStateAnswer{" +
                "id=" + id +
                ", answerTitle='" + answerTitle + '\'' +
                ", info='" + info + '\'' +
                ", date=" + date +
                ", airConditionStateRequest=" + airConditionStateRequest +
                ", eFreshAir=" + eFreshAir +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswerTitle() {
        return answerTitle;
    }

    public void setAnswerTitle(String answerTitle) {
        this.answerTitle = answerTitle;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public AirConditionStateRequest getAirConditionStateRequest() {
        return airConditionStateRequest;
    }

    public void setAirConditionStateRequest(AirConditionStateRequest airConditionStateRequest) {
        this.airConditionStateRequest = airConditionStateRequest;
    }

    public EFreshAir geteFreshAir() {
        return eFreshAir;
    }

    public void seteFreshAir(EFreshAir eFreshAir) {
        this.eFreshAir = eFreshAir;
    }
}
