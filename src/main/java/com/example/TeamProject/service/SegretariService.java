package com.example.TeamProject.service;

import com.example.TeamProject.model.Medico;
import com.example.TeamProject.model.Segretari;
import com.example.TeamProject.repository.MedicoDao;
import com.example.TeamProject.repository.SegretariDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class SegretariService {
    private SegretariDao segretariDao;

    @Autowired
    public SegretariService(SegretariDao segretariDao) {this.segretariDao = segretariDao;}

    public void addSegretari(Segretari segretari) {segretariDao.save(segretari);}

    public Optional<Segretari> getSegretari(Long segretariId) {return segretariDao.findById(segretariId);}

    public void updateSegretari(Long segretariId, Segretari segretariAggiornato) {
        Segretari segretariRepo = segretariDao.findById(segretariId).orElseThrow(InvalidKeyException::new);
        segretariRepo.setNome(segretariAggiornato.getNome());
        segretariRepo.setCognome(segretariAggiornato.getCognome());
        segretariRepo.setCodiceFiscale(segretariAggiornato.getCodiceFiscale());
        segretariRepo.setTelefonoPesonale(segretariAggiornato.getTelefonoPesonale());
        segretariDao.save(segretariRepo);
    }
    public void deleteSegretari(Long segretariId) {
        segretariDao.deleteById(segretariId);
    }
}
