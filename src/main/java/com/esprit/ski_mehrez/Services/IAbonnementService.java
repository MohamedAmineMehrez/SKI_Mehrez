package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Abonnement;
import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();
    Abonnement addA(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Optional retrieveAbonnement (Long numAbonn);
    void RemoveAbonnement(Long numAbonn);
    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);
    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);
}
