package com.example.TeamProject.service;

import com.example.TeamProject.model.Prenotazione;
import com.example.TeamProject.repository.PrenotazioneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class PrenotazioneService {
    public PrenotazioneDao prenotazioneDao;

    @Autowired
    public PrenotazioneService (PrenotazioneDao prenotazioneDao){
        this.prenotazioneDao = prenotazioneDao;
    }

    public void addPrenotazione(Prenotazione prenotazione){
        prenotazioneDao.save(prenotazione);
    }
    public Optional<Prenotazione> getPrenotazione(Long prenotazioneId){
        return prenotazioneDao.findById(prenotazioneId);
    }

    public void updatePrenotazione(Long prenotazioneId, Prenotazione prenotazioneAggiornata){
        Prenotazione prenotazioneRepo = prenotazioneDao.findById(prenotazioneId).orElseThrow(InvalidKeyException::new);
        prenotazioneRepo.setOrario(prenotazioneAggiornata.getOrario());
        prenotazioneRepo.setAmbulatorio(prenotazioneAggiornata.getAmbulatorio());
        prenotazioneRepo.setMotivo(prenotazioneAggiornata.getMotivo());
        prenotazioneDao.save(prenotazioneRepo);
    }

    public void deletePrenotazione(Long prenotazioneId){
        prenotazioneDao.deleteById(prenotazioneId);
    }
}
