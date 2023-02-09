package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Piste;
import com.esprit.ski_mehrez.Entities.Skieur;

import java.util.List;
import java.util.Optional;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addP(Piste piste);
    Piste updatePiste (Piste piste);
    Optional retrievePiste (Long numPiste);
    void RemovePiste(Long numPiste);
}
