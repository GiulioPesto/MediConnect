package com.example.TeamProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "secretary")
public class SecretaryEntity extends Staff {
    @Column(name = "office_telephone")
    private String officeTelephone;
    /*@OneToMany
    private BookingEntity bookings;*/

    public SecretaryEntity(Long id, String taxCode, String firstName, String lastName, String personalTelephone, String officeTelephone) {
        super(id, taxCode, firstName, lastName, personalTelephone);
        this.officeTelephone = officeTelephone;
    }

    public SecretaryEntity() {}

    public String getOfficeTelephone() {
        return officeTelephone;
    }

    public void setOfficeTelephone(String officeTelephone) {
        this.officeTelephone = officeTelephone;
    }
}
