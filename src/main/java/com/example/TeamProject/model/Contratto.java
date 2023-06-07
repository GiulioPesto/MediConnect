package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Contratto {
    private Integer id;
    private Timestamp dataInizio;
    private Timestamp dataFine;
    private Long retribuzione;
}