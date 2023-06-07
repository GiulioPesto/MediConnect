package com.example.TeamProject.service;

import com.example.TeamProject.model.StudioMedico;
import com.example.TeamProject.repository.StudioMedicoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class StudioMedicoService {
    private StudioMedicoDao studioMedicoDao;

    @Autowired
    public StudioMedicoService(StudioMedicoDao studioMedicoDao) {
        this.studioMedicoDao = studioMedicoDao;
    }


    public void addStudioMedico(StudioMedico studioMedico) {
        studioMedicoDao.save(studioMedico);
    }

    public Optional<StudioMedico> getStudioMedico(Long studioMedicoId) {
        return studioMedicoDao.findById(studioMedicoId);
    }

    public void updateStudioMedico(Long studioMedicoId, StudioMedico studioMedicoAggiornato) {
        StudioMedico studioMedicoRepo = studioMedicoDao.findById(studioMedicoId).orElseThrow(InvalidKeyException::new);
        studioMedicoRepo.setCitta(studioMedicoAggiornato.getCitta());
        studioMedicoRepo.setNome(studioMedicoAggiornato.getNome());
        studioMedicoRepo.setIndirizzo(studioMedicoAggiornato.getIndirizzo());
        studioMedicoRepo.setTelefono(studioMedicoAggiornato.getTelefono());
        studioMedicoRepo.setPartitaIva(studioMedicoAggiornato.getPartitaIva());
        studioMedicoDao.save(studioMedicoRepo);
    }

    public void deleteStudioMedico(Long studioMedicoId) {
        studioMedicoDao.deleteById(studioMedicoId);
    }
}
