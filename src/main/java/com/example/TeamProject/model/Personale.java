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
}
