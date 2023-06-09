package com.example.TeamProject.controller;

import com.example.TeamProject.model.Prenotazione;
import com.example.TeamProject.service.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prenotazione/")
public class PrenotazioneController {
    private PrenotazioneService prenotazioneService;

    @Autowired
    public PrenotazioneController(PrenotazioneService prenotazioneService){
        this.prenotazioneService = prenotazioneService;
    }
    @PostMapping
    public ResponseEntity<?> registraPrenotazione(@RequestBody Prenotazione prenotazione){
        prenotazioneService.addPrenotazione(prenotazione);
        return ResponseEntity.ok().build();
    }
    @GetMapping("{id}")
    public ResponseEntity<Prenotazione> visualizzaPrenotazione(@PathVariable("id") Long prenotazioneId){
        return ResponseEntity.ok(prenotazioneService.getPrenotazione(prenotazioneId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> aggiornaPrenotazione(@PathVariable("id") Long prenotazioneId,@RequestBody Prenotazione prenotazione){
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> rimuoviPrenotazione(@PathVariable("id") Long prenotazioneId){
        prenotazioneService.deletePrenotazione(prenotazioneId);
        return ResponseEntity.ok().build();
    }

}
