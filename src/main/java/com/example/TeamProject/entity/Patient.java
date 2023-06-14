package com.example.TeamProject.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.AccessType;

@Entity
@Table(name = "patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String taxCode;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String telephone;
    @Column(nullable = false)
    private String email;
    /*@OneToMany
    private MedicalReportEntity medicalReports;
    @OneToMany
    private BookingEntity bookings;*/

    public PatientEntity(String taxCode, String firstName, String lastName, String telephone, String email) {
        this.taxCode = taxCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
    }

    public PatientEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
