package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Abonnement;
import com.esprit.ski_mehrez.Entities.Skieur;

import java.util.List;
import java.util.Optional;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();
    Abonnement addA(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Optional retrieveAbonnement (Long numAbonn);
    void RemoveAbonnement(Long numAbonn);
}
