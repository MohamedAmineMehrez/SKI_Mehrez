package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Piste;
import com.esprit.ski_mehrez.Reposotory.PisteRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PisteService implements IPisteService {
 @Autowired
    PisteRepostory pisteRepostory;
    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepostory.findAll();
    }

    @Override
    public Piste addP(Piste piste) {
        return pisteRepostory.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepostory.save(piste);
    }

    @Override
    public Optional retrievePiste(Long numPiste) {
        return pisteRepostory.findById(numPiste);
    }

    @Override
    public void RemovePiste(Long numPiste) {
            pisteRepostory.deleteById(numPiste);
    }
}
