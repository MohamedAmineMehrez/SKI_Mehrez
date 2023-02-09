package com.esprit.ski_mehrez.Controller;

import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Services.ISkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Skieur")
public class SkieurController  {
    @Autowired
    ISkieurService Iskieurservice;
    //localhost:9090/retivveAllSkieurs
    @GetMapping("retivveAllSkieurs")
    public List<Skieur> getall()
    {
        return Iskieurservice.retrieveAllSkieurs();
    }
    @PostMapping

    public Skieur addS(@RequestBody  Skieur s)
    {
        return Iskieurservice.addS(s);
    }
    @DeleteMapping("{id}")
    public void RemoveS(@PathVariable Long id) {
        Iskieurservice.RemoveSkieur(id);
    }
    @PutMapping
    public Skieur UpdateS(@RequestBody  Skieur s)
    {
        return Iskieurservice.updateSkieur(s);
    }
    @GetMapping("{id}")
    public Optional<Skieur> FindS(@PathVariable Long id)
    {
        return Iskieurservice.retrieveSkieur(id);
    }
    @PutMapping("/p/{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur, @PathVariable Long numPiste) {
        return Iskieurservice.assignSkierToPiste(numSkieur, numPiste);

    }
    @PutMapping("/s/{numSkieur}/{numAbon}")

    public Skieur AssignSkierToSubscription(@PathVariable long numSkieur, @PathVariable long numAbon) {

        return Iskieurservice.AssignSkierToSubscription(numSkieur, numAbon);
    }
}