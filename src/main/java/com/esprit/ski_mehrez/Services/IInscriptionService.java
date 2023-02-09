package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Inscription;
import com.esprit.ski_mehrez.Entities.Skieur;

import java.util.List;
import java.util.Optional;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscriptions();
    Inscription addI(Inscription inscription);
    Inscription updateInscription (Inscription inscription);
    Optional retrieveInscription (Long numInscription);
    void RemoveInscription(Long numInscription);
}
