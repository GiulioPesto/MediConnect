package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor extends Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String specialization;
    private String orderRegistration;

    public Doctor(Long id, String taxCode, String firstName, String lastName, String personalTelephone, String specialization, String orderRegistration) {
        super(id, taxCode, firstName, lastName, personalTelephone);
        this.specialization = specialization;
        this.orderRegistration = orderRegistration;
    }

    public Doctor(){}

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