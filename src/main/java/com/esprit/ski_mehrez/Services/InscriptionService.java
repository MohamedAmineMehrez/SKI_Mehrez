package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Inscription;
import com.esprit.ski_mehrez.Reposotory.InscriptionRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class InscriptionService implements IInscriptionService{
   @Autowired
    InscriptionRepostory inscriptionRepostory;
    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return inscriptionRepostory.findAll();
    }

    @Override
    public Inscription addI(Inscription inscription) {
        return inscriptionRepostory.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepostory.save(inscription);
    }

    @Override
    public Optional retrieveInscription(Long numInscription) {
        return inscriptionRepostory.findById(numInscription);
    }

    @Override
    public void RemoveInscription(Long numInscription) {
                inscriptionRepostory.deleteById(numInscription);
    }
}
