package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
public class StudioMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String partitaIva;
    private String nome;
    private String citta;
    private String indirizzo;
    private String telefono;

    public StudioMedico(String partitaIva, String nome, String citta, String indirizzo, String telefono) {
        this.partitaIva = partitaIva;
        this.nome = nome;
        this.citta = citta;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }

    public StudioMedico() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
