package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Cours;
import com.esprit.ski_mehrez.Reposotory.CoursRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CoursService implements ICoursService{
   @Autowired
    CoursRepostory coursRepostory;
    @Override
    public List<Cours> retrieveAllCours() {
        return coursRepostory.findAll();
    }

    @Override
    public Cours addC(Cours cours) {
        return coursRepostory.save(cours);
    }

    @Override
    public Cours updateCour(Cours cours) {
        return coursRepostory.save(cours);
    }

    @Override
    public Optional retrieveCour(Long numCour) {
        return coursRepostory.findById(numCour);
    }

    @Override
    public void RemoveCour(Long numCour) {
        coursRepostory.deleteById(numCour);
    }
}
