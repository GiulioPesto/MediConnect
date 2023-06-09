package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Timestamp time;
    private String medicalOffice;
    private String reason;

    public Booking(){}

    public Booking(Timestamp time, String medicalOffice, String reason) {
        this.time = time;
        this.medicalOffice = medicalOffice;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getMedicalOffice() {
        return medicalOffice;
    }

    public void setMedicalOffice(String medicalOffice) {
        this.medicalOffice = medicalOffice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}