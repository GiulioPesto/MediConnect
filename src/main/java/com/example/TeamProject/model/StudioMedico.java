package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class StudioMedico {
    private String partitaIva;
    private String nome;
    private String citta;
    private String indirizzo;
    private String telefono;
}
