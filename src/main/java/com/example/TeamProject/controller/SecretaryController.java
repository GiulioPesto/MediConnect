package com.example.TeamProject.controller;

import com.example.TeamProject.entity.Secretary;
import com.example.TeamProject.service.SecretaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/secretary/")
public class SecretaryController {
    private SecretaryService secretaryService;

    @Autowired
    public SecretaryController(SecretaryService secretaryService) {
        this.secretaryService = secretaryService;
    }

    @PostMapping
    public ResponseEntity<?> registerSecretary(@RequestBody Secretary secretary) {
        secretaryService.addSecretary(secretary);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Secretary> viewSecretary(@PathVariable("id") Long secretaryId) {
        return ResponseEntity.ok(secretaryService.getSecretary(secretaryId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateSecretary(@PathVariable("id") Long secretaryId,
                                             @RequestBody Secretary secretary) {
        secretaryService.updateSecretary(secretaryId, secretary);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> removeSecretary(@PathVariable("id") Long secretaryId) {
        secretaryService.deleteSecretary(secretaryId);
        return ResponseEntity.ok().build();
    }
}