package com.example.TeamProject.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
public class Segretari extends Personale{
    private String telefono_segreteria;
}
