package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class RefertoMedico {
    private Integer id;
    private String descrizione;
}
