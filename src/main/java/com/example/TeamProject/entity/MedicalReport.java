package com.example.TeamProject.entity;

import jakarta.persistence.*;

import javax.print.Doc;

@Entity
@Table(name = "medical_report")
public class MedicalReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String description;
    /*@ManyToOne
    private DoctorEntity doctor;
    @ManyToOne
    private PatientEntity patient;*/

    public MedicalReportEntity() {
    }

    public MedicalReportEntity(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}