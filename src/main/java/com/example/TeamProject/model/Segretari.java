package com.example.TeamProject.model;

import jakarta.persistence.Entity;

@Entity
public class Segretari extends Personale{
    private String telefonoSegreteria;

    public Segretari(Long id, String codiceFiscale, String nome, String cognome, String telefonoPesonale, String telefonoSegreteria) {
        super(id, codiceFiscale, nome, cognome, telefonoPesonale);
        this.telefonoSegreteria = telefonoSegreteria;
    }

    public Segretari() {}

    public String getTelefonoSegreteria() {
        return telefonoSegreteria;
    }

    public void setTelefonoSegreteria(String telefonoSegreteria) {
        this.telefonoSegreteria = telefonoSegreteria;
    }
}
