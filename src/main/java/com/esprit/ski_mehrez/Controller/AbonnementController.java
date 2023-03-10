package com.esprit.ski_mehrez.Controller;

import com.esprit.ski_mehrez.Entities.Abonnement;
import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Services.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Abonnement")
public class AbonnementController {
    @Autowired
    IAbonnementService iAbonnementService;
    //localhost:9090/retivveAllAbonnements
    @GetMapping("retivveAllAbonnements")
    public List<Abonnement> getall()
    {
        return iAbonnementService.retrieveAllAbonnements();
    }
    @PostMapping

    public Abonnement addA(@RequestBody Abonnement s)
    {
        return iAbonnementService.addA(s);
    }
    @DeleteMapping("{id}")
    public void RemoveS(@PathVariable Long id) {
        iAbonnementService.RemoveAbonnement(id);
    }
    @PutMapping
    public Abonnement UpdateA(@RequestBody  Abonnement s)
    {
        return iAbonnementService.updateAbonnement(s);
    }
    @GetMapping("{id}")
    public Optional<Abonnement> FindS(@PathVariable Long id)
    {
        return iAbonnementService.retrieveAbonnement(id);
    }
    @GetMapping("/d/{datedebut}/{datefin}")
    public List<Abonnement> findbyDate(@PathVariable LocalDate datedebut,@PathVariable LocalDate datefin)
    {
        return iAbonnementService.retrieveSubscriptionsByDates(datedebut,datefin);
    }
}
