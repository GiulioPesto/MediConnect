package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
public abstract class Personale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private String telefonoPesonale;

    public Personale(Long id, String codiceFiscale, String nome, String cognome, String telefonoPesonale) {
        this.id = id;
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
        this.telefonoPesonale = telefonoPesonale;
    }
    public Personale() {}
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefonoPesonale() {
        return telefonoPesonale;
    }

    public void setTelefonoPesonale(String telefonoPesonale) {
        this.telefonoPesonale = telefonoPesonale;
    }
}
