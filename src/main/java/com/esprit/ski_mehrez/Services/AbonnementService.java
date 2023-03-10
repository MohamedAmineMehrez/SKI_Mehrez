package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Abonnement;
import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Entities.TypeAbonnement;
import com.esprit.ski_mehrez.Reposotory.AbonnementRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class AbonnementService implements IAbonnementService{
    @Autowired
    AbonnementRepostory abonnementRepostory;
    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepostory.findAll();
    }

    @Override
    public Abonnement addA(Abonnement abonnement) {
        return abonnementRepostory.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepostory.save(abonnement);
    }

    @Override
    public Optional retrieveAbonnement(Long numAbonn) {
        return abonnementRepostory.findById(numAbonn);
    }

    @Override
    public void RemoveAbonnement(Long numAbonn) {
        abonnementRepostory.deleteById(numAbonn);
    }

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return abonnementRepostory.findByTypeAbon(type);
    }

    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return abonnementRepostory.findByDateDebutAfterAndAndDateFinBefore(startDate,endDate);
    }
}
