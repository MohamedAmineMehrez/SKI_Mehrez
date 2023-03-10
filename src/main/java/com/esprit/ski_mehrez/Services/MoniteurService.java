package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Cours;
import com.esprit.ski_mehrez.Entities.Moniteur;
import com.esprit.ski_mehrez.Entities.Piste;
import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Reposotory.CoursRepostory;
import com.esprit.ski_mehrez.Reposotory.MoniteurRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
@Service
public class MoniteurService implements IMoniteurService{
   @Autowired
    MoniteurRepostory moniteurRepostory;
   @Autowired
    CoursRepostory coursRepostory;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepostory.findAll();
    }

    @Override
    public Moniteur addM(Moniteur moniteur) {
        return moniteurRepostory.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepostory.save(moniteur);
    }

    @Override
    public Optional retrieveMoniteur(Long numMoniteur) {
        return moniteurRepostory.findById(numMoniteur);
    }

    @Override
    public void RemoveMoniteur(Long numMoniteur) {
            moniteurRepostory.deleteById(numMoniteur);
    }

    @Override
    public Moniteur assignMoniteurTocour(Long numMoniteur, Long numCour) {
        Moniteur moniteur=moniteurRepostory.findById(numMoniteur).orElse(null) ;
        Assert.notNull(moniteur,"moniteur not found");
        Cours cours= coursRepostory.findById(numCour).orElse(null);
        Assert.notNull(cours,"cour not found");
        if(moniteur!=null && cours!=null){
            List<Cours>pistes=moniteur.getCours();
            pistes.add(cours);
            moniteur.setCours(pistes);
            return  moniteurRepostory.save(moniteur);
        } return null;
    }
}
