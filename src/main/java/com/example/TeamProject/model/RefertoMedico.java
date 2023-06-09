package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
public class RefertoMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descrizione;

    public RefertoMedico() {
    }

    public RefertoMedico(long id, String descrizione) {
        this.id = id;
        this.descrizione = descrizione;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
