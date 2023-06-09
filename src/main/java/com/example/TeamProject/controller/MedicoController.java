package com.example.TeamProject.controller;


import com.example.TeamProject.model.Medico;
import com.example.TeamProject.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/medico/")
public class MedicoController{
    private MedicoService medicoService;

    @Autowired
    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @PostMapping
    public ResponseEntity<?> registraMedico(@RequestBody Medico medico) {
        medicoService.addMedico(medico);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Medico> visualizzaMedico(@PathVariable("id") Long medicoId) {
        return ResponseEntity.ok(medicoService.getMedico(medicoId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> aggiornaMedico(@PathVariable("id") Long medicoId,
                                              @RequestBody Medico medico) {
        medicoService.updateMedico(medicoId, medico);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> rimuoviMedico(@PathVariable("id") Long medicoId) {
        medicoService.deleteMedico(medicoId);
        return ResponseEntity.ok().build();
    }
}

