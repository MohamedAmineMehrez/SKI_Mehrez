package com.esprit.ski_mehrez.Services;

import com.esprit.ski_mehrez.Entities.Cours;
import com.esprit.ski_mehrez.Reposotory.CoursRepostory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Slf4j
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
        log.info("IN methode delete cour by id");
        coursRepostory.deleteById(numCour);
        log.info("OUT methode delete cour by id");
    }

    @Scheduled(fixedDelay = 60000)
    @Scheduled(fixedRate =60000 )
    @Scheduled(cron = "0 0 0 ** MON-FRI")
    @Override
    public void test() {
        log.info("HABAB");
    }
}
