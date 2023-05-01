package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Cours;
import com.esprit.ski_mehrez.Entities.Skieur;

import java.util.List;
import java.util.Optional;

public interface ICoursService {
    List<Cours> retrieveAllCours();
    Cours addC(Cours cours);
    Cours updateCour (Cours cours);
    Optional retrieveCour (Long numCour);
    void RemoveCour(Long numCour);
    public void test();
}
