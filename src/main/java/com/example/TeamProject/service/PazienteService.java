package com.example.TeamProject.service;

import com.example.TeamProject.model.Contratto;
import com.example.TeamProject.model.Paziente;
import com.example.TeamProject.repository.PazienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class PazienteService {
    private PazienteDao pazienteDao;

    @Autowired
    public PazienteService(PazienteDao pazienteDao) {
        this.pazienteDao = pazienteDao;
    }

    public void addPaziente(Paziente paziente) {
        pazienteDao.save(paziente);
    }

    public Optional<Paziente> getPaziente(Long pazienteId) {
        return pazienteDao.findById(pazienteId);
    }

    public void updatePaziente(Long pazienteId, Paziente pazienteAggiornato) {
        Paziente pazienteRepo = pazienteDao.findById(pazienteId).orElseThrow(InvalidKeyException::new);
        pazienteRepo.setNome(pazienteAggiornato.getNome());
        pazienteRepo.setCognome(pazienteAggiornato.getCognome());
        pazienteRepo.setCodiceFiscale(pazienteAggiornato.getCodiceFiscale());
        pazienteRepo.setTelefono(pazienteAggiornato.getTelefono());
        pazienteRepo.setEmail(pazienteAggiornato.getEmail());
        pazienteDao.save(pazienteRepo);
    }

    public void deletePaziente(Long pazienteId) {
        pazienteDao.deleteById(pazienteId);
    }
}
