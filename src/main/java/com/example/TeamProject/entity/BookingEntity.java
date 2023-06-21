package com.example.TeamProject.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import com.example.TeamProject.config.*;
import org.springframework.security.core.userdetails.User;

import java.sql.Timestamp;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Optional;

// TODO controllare @OneToMany e @ManyToOne nelle relative entity
@Entity
@Table(name = "booking")
public class BookingEntity extends Auditable<User> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "time", nullable = false)
    private Date time;
    @Column(name = "medical_office")
    private String medicalOffice;
    @Column(name = "reason")
    private String reason;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientEntity patient;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "secretary_id", nullable = false)
    private SecretaryEntity secretary;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private DoctorEntity doctor;

    public BookingEntity(){}

    public BookingEntity(Date time, String medicalOffice, String reason) {
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
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

    public PatientEntity getPatient() { return patient; }

    public void setPatient(PatientEntity patient) { this.patient = patient; }

    public SecretaryEntity getSecretary() { return secretary; }

    public void setSecretary(SecretaryEntity secretary) { this.secretary = secretary; }

    public DoctorEntity getDoctor() { return doctor; }

    public void setDoctor(DoctorEntity doctor) { this.doctor = doctor; }
}