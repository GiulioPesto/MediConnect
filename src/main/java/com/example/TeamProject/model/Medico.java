package com.example.TeamProject.model;

import jakarta.persistence.Entity;

@Entity
public class Medico extends Personale{
    private String specializzazione;
    private String iscrizioneOrdine;

    public Medico(Long id, String codiceFiscale, String nome, String cognome, String telefonoPesonale, String specializzazione, String iscrizioneOrdine) {
        super(id, codiceFiscale, nome, cognome, telefonoPesonale);
        this.specializzazione = specializzazione;
        this.iscrizioneOrdine = iscrizioneOrdine;
    }

    public Medico() {}

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public String getIscrizioneOrdine() {
        return iscrizioneOrdine;
    }

    public void setIscrizioneOrdine(String iscrizioneOrdine) {
        this.iscrizioneOrdine = iscrizioneOrdine;
    }
}
