package com.example.TeamProject.service;
import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.entity.SecretaryEntity;
import com.example.TeamProject.repository.SecretaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Collection;
import java.util.Optional;

@Service
public class SecretaryService {
    @Autowired
    private SecretaryRepository secretaryRepository;

    public void addSecretary(SecretaryEntity secretary) {
        secretaryRepository.save(secretary);
    }

    public Optional<SecretaryEntity> getSecretary(Long secretaryId) {
        return secretaryRepository.findById(secretaryId);
    }

    public Collection<SecretaryEntity> getAllSecretaries() {
        return secretaryRepository.findAll();
    }

    public void updateSecretary(Long secretaryId, SecretaryEntity updatedSecretary) {
        SecretaryEntity secretaryRepo = secretaryRepository.findById(secretaryId).orElseThrow(InvalidKeyException::new);
        secretaryRepo.setFirstName(updatedSecretary.getFirstName());
        secretaryRepo.setLastName(updatedSecretary.getLastName());
        secretaryRepo.setTaxCode(updatedSecretary.getTaxCode());
        secretaryRepo.setOfficeTelephone(updatedSecretary.getOfficeTelephone());
        secretaryRepository.save(secretaryRepo);
    }

    public void deleteSecretary(Long secretaryId) {
        secretaryRepository.deleteById(secretaryId);
    }

    public void deleteAllSecretaries() { secretaryRepository.deleteAll(); }
}