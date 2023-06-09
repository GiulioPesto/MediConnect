package com.example.TeamProject.service;

import com.example.TeamProject.model.Medico;
import com.example.TeamProject.model.RefertoMedico;
import com.example.TeamProject.repository.RefertoMedicoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class RefertoMedicoService {

    @Autowired
    RefertoMedicoDao refertoMedicoDao;

    public void addReferto(RefertoMedico refertoMedico){
        refertoMedicoDao.save(refertoMedico);
    }

    public Optional<RefertoMedico> getRefertoMedico(Long refertoMedicoId){
        return refertoMedicoDao.findById(refertoMedicoId);
    }

    public void updateRefertoMedico(Long refertoMedicoId, RefertoMedico refertoMedicoAggiornato){
        RefertoMedico refertoMedicoRepo = refertoMedicoDao.findById(refertoMedicoId).orElseThrow(InvalidKeyException::new);
        refertoMedicoRepo.setDescrizione(refertoMedicoAggiornato.getDescrizione());
        refertoMedicoDao.save(refertoMedicoRepo);
    }

    public void deleteRefertoMedico(Long refertoMedicoId){
        refertoMedicoDao.deleteById(refertoMedicoId);
    }
}
