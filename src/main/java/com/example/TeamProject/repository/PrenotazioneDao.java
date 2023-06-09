package com.example.TeamProject.repository;

import com.example.TeamProject.model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneDao extends JpaRepository<Prenotazione,Long> {

}
