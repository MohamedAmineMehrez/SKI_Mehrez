package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Moniteur;
import com.esprit.ski_mehrez.Reposotory.MoniteurRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MoniteurService implements IMoniteurService{
   @Autowired
    MoniteurRepostory moniteurRepostory;
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
}
