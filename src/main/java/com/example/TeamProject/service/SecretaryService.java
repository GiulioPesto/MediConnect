package com.example.TeamProject.service;
import com.example.TeamProject.entity.BookingEntity;
import com.example.TeamProject.entity.PatientEntity;
import com.example.TeamProject.entity.SecretaryEntity;
import com.example.TeamProject.enums.AccountActivationStateEnum;
import com.example.TeamProject.repository.SecretaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.openmbean.InvalidKeyException;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SecretaryService {
    @Autowired
    private SecretaryRepository secretaryRepository;

    public void addSecretary(SecretaryEntity secretary) {
        secretaryRepository.save(secretary);
    }

    public Optional<SecretaryEntity> getSecretary(Long secretaryId) {
        return secretaryRepository.findById(secretaryId).stream().filter(a -> a.getActivation()!=AccountActivationStateEnum.NOT_ACTIVE).findFirst();
    }

    public Collection<SecretaryEntity> getAllSecretaries() {
        return secretaryRepository.findAll().stream().filter(a -> a.getActivation()!= AccountActivationStateEnum.NOT_ACTIVE).collect(Collectors.toSet());
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
        SecretaryEntity secretaryRepo =  secretaryRepository.findById(secretaryId).orElseThrow(InvalidKeyException::new);
        secretaryRepo.setActivation(AccountActivationStateEnum.NOT_ACTIVE);
        secretaryRepository.save(secretaryRepo);
    }

    public void reactivateSecretary(Long secretaryId) {
        SecretaryEntity secretaryRepo =  secretaryRepository.findById(secretaryId).orElseThrow(InvalidKeyException::new);
        secretaryRepo.setActivation(AccountActivationStateEnum.ACTIVE);
        secretaryRepository.save(secretaryRepo);
    }

    public void deleteAllSecretaries() { secretaryRepository.findAll().forEach(a -> deleteSecretary(a.getId())); }

    public void test() {}
}