package com.example.TeamProject.entity;

import jakarta.persistence.*;

import javax.print.Doc;

@Entity
@Table(name = "medical_report")
public class MedicalReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "description", nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorEntity doctor;
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientEntity patient;

    public MedicalReportEntity() {
    }

    public MedicalReportEntity(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DoctorEntity getDoctor() { return doctor; }

    public void setDoctor(DoctorEntity doctor) { this.doctor = doctor; }

    public PatientEntity getPatient() { return patient; }

    public void setPatient(PatientEntity patient) { this.patient = patient; }
}