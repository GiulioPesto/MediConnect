package com.example.TeamProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class DoctorEntity extends Staff {
    @Column(name = "specialization")
    private String specialization;
    @Column(name = "order_registration")
    private String orderRegistration;
    /*@OneToMany
    private BookingEntity bookings;
    @OneToMany
    private MedicalReportEntity medicalReports;*/

    public DoctorEntity(Long id, String taxCode, String firstName, String lastName, String personalTelephone, String specialization, String orderRegistration) {
        super(id, taxCode, firstName, lastName, personalTelephone);
        this.specialization = specialization;
        this.orderRegistration = orderRegistration;
    }

    public DoctorEntity(){}

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getOrderRegistration() {
        return orderRegistration;
    }

    public void setOrderRegistration(String orderRegistration) {
        this.orderRegistration = orderRegistration;
    }
}