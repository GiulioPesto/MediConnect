package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Personale {
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private String telefonoPesonale;
}
