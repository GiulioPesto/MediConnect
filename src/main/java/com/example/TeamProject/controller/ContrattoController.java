package com.example.TeamProject.controller;

import com.example.TeamProject.model.Contratto;
import com.example.TeamProject.service.ContrattoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/contratto/")
public class ContrattoController {
    private ContrattoService contrattoService;

    @Autowired
    public ContrattoController(ContrattoService contrattoService) {
        this.contrattoService = contrattoService;
    }

    @PostMapping
    public ResponseEntity<?> registraContratto(@RequestBody Contratto contratto) {
        contrattoService.addContratto(contratto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Contratto> visualizzaContratto(@PathVariable("id") Long contrattoId) {
        return ResponseEntity.ok(contrattoService.getContratto(contrattoId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> aggiornaContratto(@PathVariable("id") Long contrattoId,
                                               @RequestBody Contratto contratto) {
        contrattoService.updateContratto(contrattoId, contratto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> rimuoviContratto(@PathVariable("id") Long contrattoId) {
        contrattoService.deleteContratto(contrattoId);
        return ResponseEntity.ok().build();
    }
}
