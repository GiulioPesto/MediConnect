package com.example.TeamProject.controller;

import com.example.TeamProject.model.Contratto;
import com.example.TeamProject.model.Paziente;
import com.example.TeamProject.service.PazienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/paziente/")
public class PazienteController {
    private PazienteService pazienteService;

    @Autowired
    public PazienteController(PazienteService pazienteService) {
        this.pazienteService = pazienteService;
    }

    @PostMapping
    public ResponseEntity<?> registraPaziente(@RequestBody Paziente paziente) {
        pazienteService.addPaziente(paziente);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Paziente> visualizzaPaziente(@PathVariable("id") Long pazienteId) {
        return ResponseEntity.ok(pazienteService.getPaziente(pazienteId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> aggiornaPaziente(@PathVariable("id") Long pazienteId,
                                               @RequestBody Paziente paziente) {
        pazienteService.updatePaziente(pazienteId, paziente);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> rimuoviPaziente(@PathVariable("id") Long pazienteId) {
        pazienteService.deletePaziente(pazienteId);
        return ResponseEntity.ok().build();
    }
}
