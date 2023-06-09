package com.example.TeamProject.service;

import com.example.TeamProject.model.Medico;
import com.example.TeamProject.repository.MedicoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class MedicoService {
    private MedicoDao medicoDao;

    @Autowired
    public MedicoService(MedicoDao medicoDao) {this.medicoDao = medicoDao;}

    public void addMedico(Medico medico) {medicoDao.save(medico);}

    public Optional<Medico> getMedico(Long medicoId) {return medicoDao.findById(medicoId);}

    public void updateMedico(Long medicoId, Medico medicoAggiornato) {
        Medico medicoRepo = medicoDao.findById(medicoId).orElseThrow(InvalidKeyException::new);
        medicoRepo.setNome(medicoAggiornato.getNome());
        medicoRepo.setCognome(medicoAggiornato.getCognome());
        medicoRepo.setCodiceFiscale(medicoAggiornato.getCodiceFiscale());
        medicoRepo.setTelefonoPesonale(medicoAggiornato.getTelefonoPesonale());
        medicoRepo.setSpecializzazione(medicoAggiornato.getSpecializzazione());
        medicoRepo.setIscrizioneOrdine(medicoAggiornato.getIscrizioneOrdine());
        medicoDao.save(medicoRepo);
    }
    public void deleteMedico(Long medicoId) {
        medicoDao.deleteById(medicoId);
    }
}
