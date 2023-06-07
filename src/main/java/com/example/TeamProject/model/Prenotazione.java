package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Prenotazione {
    private Integer id;
    private Timestamp orario;
    private String ambulatorio;
    private String motivo;
}
