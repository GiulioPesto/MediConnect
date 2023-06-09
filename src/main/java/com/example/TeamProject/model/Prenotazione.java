package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;

@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Timestamp orario;
    private String ambulatorio;
    private String motivo;

    public Prenotazione(){}

    public Prenotazione(Timestamp orario, String ambulatorio, String motivo) {
        this.orario = orario;
        this.ambulatorio = ambulatorio;
        this.motivo = motivo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getOrario() {
        return orario;
    }

    public void setOrario(Timestamp orario) {
        this.orario = orario;
    }

    public String getAmbulatorio() {
        return ambulatorio;
    }

    public void setAmbulatorio(String ambulatorio) {
        this.ambulatorio = ambulatorio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }


}
