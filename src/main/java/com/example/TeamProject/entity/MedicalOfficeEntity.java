package com.example.TeamProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "medical_office")
public class MedicalOfficeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "tax_code")
    private String taxCode;
    @Column(name = "name")
    private String name;
    @Column(name = "city")
    private String city;
    @Column(name =" address")
    private String address;
    @Column(name = "telephone")
    private String telephone;
    /*@OneToMany
    private ContractEntity contracts;*/

    public MedicalOfficeEntity(String taxCode, String name, String city, String address, String telephone) {
        this.taxCode = taxCode;
        this.name = name;
        this.city = city;
        this.address = address;
        this.telephone = telephone;
    }

    public MedicalOfficeEntity() {}

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