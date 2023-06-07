package com.example.TeamProject.model;


import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Paziente {
    private String codiceFiscale;
    private String nome;
    private String cognome;
    private String telefono;
    private String email;
}