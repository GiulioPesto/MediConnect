package com.example.TeamProject.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
// TODO controllare @OneToMany e @ManyToOne nelle relative entity
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Timestamp time;
    @Column
    private String medicalOffice;
    @Column
    private String reason;
    /*@ManyToOne
    private PatientEntity patient;
    @ManyToOne
    private SecretaryEntity secretary;*/

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