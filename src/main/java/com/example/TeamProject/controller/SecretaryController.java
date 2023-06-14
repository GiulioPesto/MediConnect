package com.example.TeamProject.controller;

import com.example.TeamProject.entity.SecretaryEntity;
import com.example.TeamProject.service.SecretaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/secretary/")
public class SecretaryController {
    @Autowired
    private SecretaryService secretaryService;

    @PostMapping
    public ResponseEntity<SecretaryEntity> registerSecretary(@RequestBody SecretaryEntity secretary) {
        secretaryService.addSecretary(secretary);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<SecretaryEntity> viewSecretary(@PathVariable("id") Long secretaryId) {
        if (secretaryService.getSecretary(secretaryId).isPresent()) {
            return ResponseEntity.ok(secretaryService.getSecretary(secretaryId).get());
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<SecretaryEntity> updateSecretary(@PathVariable("id") Long secretaryId,
                                                           @RequestBody SecretaryEntity secretary) {
        secretaryService.updateSecretary(secretaryId, secretary);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<SecretaryEntity> removeSecretary(@PathVariable("id") Long secretaryId) {
        secretaryService.deleteSecretary(secretaryId);
        return ResponseEntity.ok().build();
    }
}