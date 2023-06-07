package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;

@Entity
public class Contratto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Timestamp dataInizio;
    private Timestamp dataFine;
    private Double retribuzione;

    public Contratto(Timestamp dataInizio, Timestamp dataFine, Double retribuzione) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.retribuzione = retribuzione;
    }

    public Contratto() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Timestamp dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Timestamp getDataFine() {
        return dataFine;
    }

    public void setDataFine(Timestamp dataFine) {
        this.dataFine = dataFine;
    }

    public Double getRetribuzione() {
        return retribuzione;
    }

    public void setRetribuzione(Double retribuzione) {
        this.retribuzione = retribuzione;
    }
}