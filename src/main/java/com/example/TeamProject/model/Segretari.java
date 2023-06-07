package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Segretari extends Personale{
    private String telefono_segreteria;
}
