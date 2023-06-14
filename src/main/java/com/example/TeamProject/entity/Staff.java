package com.example.TeamProject.entity;

public abstract class Staff {
    private String taxCode;
    private String firstName;
    private String lastName;
    private String personalTelephone;

    public Staff(String taxCode, String firstName, String lastName, String personalTelephone) {
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
}