package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Abonnement;
import com.esprit.ski_mehrez.Entities.Piste;
import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Entities.TypeAbonnement;
import com.esprit.ski_mehrez.Reposotory.AbonnementRepostory;
import com.esprit.ski_mehrez.Reposotory.PisteRepostory;
import com.esprit.ski_mehrez.Reposotory.SkieurRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class SkieurIIM implements ISkieurService{
    @Autowired
    SkieurRepostory skieurRepostory;
    @Autowired
    PisteRepostory pisteRepository;
    @Autowired
    AbonnementRepostory abonnementRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepostory.findAll();    }

    @Override
    public Skieur addS(Skieur skieur) {return skieurRepostory.save(skieur);}

    @Override
    public Skieur updateSkieur(Skieur skieur) {
           return skieurRepostory.save(skieur);

        }


    @Override
    public Optional<Skieur> retrieveSkieur(Long numSkieur) {
        return skieurRepostory.findById(numSkieur);
    }

    @Override
    public void RemoveSkieur(Long numSkieur) {
        skieurRepostory.deleteById(numSkieur);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur=skieurRepostory.findById(numSkieur).orElse(null) ;
        Assert.notNull(skieur,"skieur not found");
        Piste piste= pisteRepository.findById(numPiste).orElse(null);
        Assert.notNull(piste,"piste not found");
        if(skieur!=null && piste!=null){
            List<Piste>pistes=skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes);
            return  skieurRepostory.save(skieur);
    } return null;
    }

    @Override
    public Skieur AssignSkierToSubscription(long numSkieur, long numAbon) {
            Skieur skieur1 =skieurRepostory.findById(numSkieur).orElse(null) ;
            Abonnement abonnement=abonnementRepository.findById(numAbon).orElse(null);
            if(skieur1!=null && abonnement!=null){

                skieur1.setAbonnement(abonnement);

                return  skieurRepostory.save(skieur1);

            }
            return null;
    }

   @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
     return skieurRepostory.findByAbonnementTypeAbon(typeAbonnement);
    }
}
