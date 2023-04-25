package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.*;
import com.esprit.ski_mehrez.Reposotory.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SkieurIIM implements ISkieurService{

    private final SkieurRepostory skieurRepostory;

    private final PisteRepostory pisteRepository;

    private final AbonnementRepostory abonnementRepository;
    private final CoursRepostory coursRepostory;
    private final InscriptionRepostory inscriptionRepostory;

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

    @Override
    public Skieur addSkieurandassigntoCour(Skieur S) {
       Assert.notNull(S.getAbonnement(),"Abonnement must not be int");
       Assert.notNull(S.getInscriptions(),"Inscription must not be int");
       List<Inscription> inscriptions=S.getInscriptions();
        inscriptions.forEach(inscription -> {
            Assert.notNull(inscription.getCour().getNumCours(),"cour must be entered");
            Cours cours=coursRepostory.findById(inscription.getCour().getNumCours()).orElse(null);
            Assert.notNull(cours,"no courses found with this id");
            inscription.setCour(cours);
            //skieurRepostory.saveAndFlush(S);autre facon
            //inscription.setSkieur(S);
            //inscriptionRepostory.save(inscription);//taw ki bch test itwali exception handler


        });
        skieurRepostory.save(S); //l'autre facon remove all but the return to change the methode
        S.getInscriptions().forEach(inscription -> {
            inscription.setSkieur(S);
            inscriptionRepostory.save(inscription);
        });
       return S;
        //nested json
    }
    //autrement n3adew liste de cour en url

    @Override
    public List<Skieur> FindSkieurbyparamateres(TypeCours inscriptions_cour_typeCours, Support inscriptions_cour_support, Coulour pistes_coulour) {
        return skieurRepostory.findByInscriptionsCourTypeCoursAndInscriptionsCourSupportAndPistesCoulour(inscriptions_cour_typeCours,inscriptions_cour_support,pistes_coulour);
    }
}
