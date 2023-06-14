package com.example.TeamProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "secretary")
public class SecretaryEntity extends Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String officeTelephone;

    public SecretaryEntity(Long id, String taxCode, String firstName, String lastName, String personalTelephone, String officeTelephone) {
        super(taxCode, firstName, lastName, personalTelephone);
        this.id = id;
        this.officeTelephone = officeTelephone;
    }

    public SecretaryEntity() {}

    public String getOfficeTelephone() {
        return officeTelephone;
    }

    public void setOfficeTelephone(String officeTelephone) {
        this.officeTelephone = officeTelephone;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }
}
