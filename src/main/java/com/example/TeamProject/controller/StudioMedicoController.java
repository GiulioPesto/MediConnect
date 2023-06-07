package com.example.TeamProject.controller;

import com.example.TeamProject.model.StudioMedico;
import com.example.TeamProject.service.StudioMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "/api/studiomedico/")
public class StudioMedicoController {
    private StudioMedicoService studioMedicoService;

    @Autowired
    public StudioMedicoController(StudioMedicoService studioMedicoService) {
        this.studioMedicoService = studioMedicoService;
    }

    @PostMapping
    public ResponseEntity<?> registraStudioMedico(@RequestBody StudioMedico studioMedico) {
        studioMedicoService.addStudioMedico(studioMedico);
        return ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<StudioMedico> visualizzaStudioMedico(@PathVariable("studioMedicoId") Long studioMedicoId) {
        return ResponseEntity.ok(studioMedicoService.getStudioMedico(studioMedicoId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> aggiornaStudioMedico(@PathVariable("studioMedicoId") Long studioMedicoId,
                                                  @RequestBody StudioMedico studioMedicoAggiornato) {
        studioMedicoService.updateStudioMedico(studioMedicoId, studioMedicoAggiornato);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminaStudioMedico(@PathVariable("studioMedicoId") Long studioMedicoId) {
        studioMedicoService.deleteStudioMedico(studioMedicoId);
        return ResponseEntity.ok().build();
    }
}
