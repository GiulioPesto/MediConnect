package com.example.TeamProject.model;

import jakarta.persistence.Entity;

@Entity
public class Secretary extends Staff {
    private String officeTelephone;

    public Secretary(Long id, String taxCode, String firstName, String lastName, String personalTelephone, String officeTelephone) {
        super(id, taxCode, firstName, lastName, personalTelephone);
        this.officeTelephone = officeTelephone;
    }

    public Secretary() {}

    public String getOfficeTelephone() {
        return officeTelephone;
    }

    public void setOfficeTelephone(String officeTelephone) {
        this.officeTelephone = officeTelephone;
    }
}
