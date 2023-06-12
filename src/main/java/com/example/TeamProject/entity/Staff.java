package com.example.TeamProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String taxCode;
    private String firstName;
    private String lastName;
    private String personalTelephone;

    public Staff(Long id, String taxCode, String firstName, String lastName, String personalTelephone) {
        this.id = id;
        this.taxCode = taxCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalTelephone = personalTelephone;
    }

    public Staff() {}

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

    public String getPersonalTelephone() {
        return personalTelephone;
    }

    public void setPersonalTelephone(String personalTelephone) {
        this.personalTelephone = personalTelephone;
    }
}