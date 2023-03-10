package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Moniteur;
import com.esprit.ski_mehrez.Entities.Skieur;

import java.util.List;
import java.util.Optional;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addM(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Optional retrieveMoniteur (Long numMoniteur);
    void RemoveMoniteur(Long numMoniteur);
    Moniteur assignMoniteurTocour(Long numMoniteur, Long numCour);

}
