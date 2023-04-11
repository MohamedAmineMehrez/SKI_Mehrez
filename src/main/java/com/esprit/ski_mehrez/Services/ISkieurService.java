package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.*;

import java.util.List;
import java.util.Optional;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addS(Skieur skieur);
    Skieur updateSkieur (Skieur skieur);
    Optional retrieveSkieur (Long numSkieur);
    void RemoveSkieur(Long numSkieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur AssignSkierToSubscription(long numSkieur, long numAbon);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
    Skieur addSkieurandassigntoCour(Skieur S);
    List<Skieur> FindSkieurbyparamateres(TypeCours inscriptions_cour_typeCours, Support inscriptions_cour_support, Coulour pistes_coulour);

}
