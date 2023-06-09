package com.example.TeamProject.controller;


import com.example.TeamProject.model.Segretari;
import com.example.TeamProject.service.SegretariService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/segretari/")
public class SegretariController{
    private SegretariService segretariService;

    @Autowired
    public SegretariController(SegretariService segretariService) {
        this.segretariService = segretariService;
    }

    @PostMapping
    public ResponseEntity<?> registraSegretari(@RequestBody Segretari segretari) {
        segretariService.addSegretari(segretari);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<Segretari> visualizzaSegretari(@PathVariable("id") Long segretariId) {
        return ResponseEntity.ok(segretariService.getSegretari(segretariId).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> aggiornaSegretari(@PathVariable("id") Long segretariId,
                                            @RequestBody Segretari segretari) {
        segretariService.updateSegretari(segretariId, segretari);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> rimuoviSegretari(@PathVariable("id") Long segretariId) {
        segretariService.deleteSegretari(segretariId);
        return ResponseEntity.ok().build();
    }
}

