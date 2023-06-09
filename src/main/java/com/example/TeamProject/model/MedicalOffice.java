package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MedicalOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String taxCode;
    private String name;
    private String city;
    private String address;
    private String telephone;

    public MedicalOffice(String taxCode, String name, String city, String address, String telephone) {
        this.taxCode = taxCode;
        this.name = name;
        this.city = city;
        this.address = address;
        this.telephone = telephone;
    }

    public MedicalOffice() {}

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}