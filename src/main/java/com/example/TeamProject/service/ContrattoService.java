package com.example.TeamProject.service;

import com.example.TeamProject.model.Contratto;
import com.example.TeamProject.repository.ContrattoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class ContrattoService {
    private ContrattoDao contrattoDao;

    @Autowired
    public ContrattoService(ContrattoDao contrattoDao) {
        this.contrattoDao = contrattoDao;
    }

    public void addContratto(Contratto contratto) {
        contrattoDao.save(contratto);
    }

    public Optional<Contratto> getContratto(Long contrattoId) {
        return contrattoDao.findById(contrattoId);
    }

    public void updateContratto(Long contrattoId, Contratto contrattoAggiornato) {
        Contratto contrattoRepo = contrattoDao.findById(contrattoId).orElseThrow(InvalidKeyException::new);
        contrattoRepo.setDataInizio(contrattoAggiornato.getDataInizio());
        contrattoRepo.setDataFine(contrattoAggiornato.getDataFine());
        contrattoRepo.setRetribuzione(contrattoAggiornato.getRetribuzione());
        contrattoDao.save(contrattoRepo);
    }

    public void deleteContratto(Long contrattoId) {
        contrattoDao.deleteById(contrattoId);
    }
}
