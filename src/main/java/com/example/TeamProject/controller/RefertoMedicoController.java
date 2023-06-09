package com.example.TeamProject.controller;

import com.example.TeamProject.model.RefertoMedico;
import com.example.TeamProject.service.RefertoMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/refertoMedico/")
public class RefertoMedicoController {

    RefertoMedicoService refertoMedicoService;

    @Autowired
    public RefertoMedicoController(RefertoMedicoService refertoMedicoService){
        this.refertoMedicoService = refertoMedicoService;
    }

    @PostMapping("create")
    public ResponseEntity<?> addReferto(@RequestBody RefertoMedico refertoMedico){
        refertoMedicoService.addReferto(refertoMedico);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getReferto(@PathVariable("id") Long id){
        return ResponseEntity.ok(refertoMedicoService.getRefertoMedico(id).get());
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateReferto(@PathVariable("id") Long id, @RequestBody RefertoMedico refertoMedico){
        refertoMedicoService.updateRefertoMedico(id, refertoMedico);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteReferto(@PathVariable("id") Long id){
        refertoMedicoService.deleteRefertoMedico(id);
        return ResponseEntity.ok().build();
    }
}
