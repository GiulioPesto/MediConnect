package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
public class Medico extends Personale{
    private String specializzazione;
    private String iscrizione_ordine;
}
