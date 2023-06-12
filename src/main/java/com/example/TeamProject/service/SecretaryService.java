package com.example.TeamProject.service;

import com.example.TeamProject.entity.Secretary;
import com.example.TeamProject.repository.SecretaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Optional;

@Service
public class SecretaryService {
    private SecretaryDao secretaryDao;

    @Autowired
    public SecretaryService(SecretaryDao secretaryDao) {
        this.secretaryDao = secretaryDao;
    }

    public void addSecretary(Secretary secretary) {
        secretaryDao.save(secretary);
    }

    public Optional<Secretary> getSecretary(Long secretaryId) {
        return secretaryDao.findById(secretaryId);
    }

    public void updateSecretary(Long secretaryId, Secretary updatedSecretary) {
        Secretary secretaryRepo = secretaryDao.findById(secretaryId).orElseThrow(InvalidKeyException::new);
        secretaryRepo.setFirstName(updatedSecretary.getFirstName());
        secretaryRepo.setLastName(updatedSecretary.getLastName());
        secretaryRepo.setTaxCode(updatedSecretary.getTaxCode());
        secretaryRepo.setOfficeTelephone(updatedSecretary.getOfficeTelephone());
        secretaryDao.save(secretaryRepo);
    }

    public void deleteSecretary(Long secretaryId) {
        secretaryDao.deleteById(secretaryId);
    }
}