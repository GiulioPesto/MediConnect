package com.example.TeamProject.entity;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "tax_code")
    private String taxCode;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "personal_telephone")
    private String personalTelephone;

    public Staff(Long id, String taxCode, String firstName, String lastName, String personalTelephone) {
        this.taxCode = taxCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalTelephone = personalTelephone;
    }

    public Staff() {}

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

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }
}