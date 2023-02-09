package com.esprit.ski_mehrez.Controller;

import com.esprit.ski_mehrez.Entities.Inscription;
import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Services.IInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Inscriptions")
public class InscriptionController {
    @Autowired
    IInscriptionService iInscriptionService;
    @GetMapping("retriveAllInscriptions")
    public List<Inscription> getall()
    {
        return iInscriptionService.retrieveAllInscriptions();
    }
    @PostMapping

    public Inscription addS(@RequestBody Inscription s)
    {
        return iInscriptionService.addI(s);
    }
    @DeleteMapping("{id}")
    public void RemoveS(@PathVariable Long id) {
        iInscriptionService.RemoveInscription(id);
    }
    @PutMapping
    public Inscription UpdateS(@RequestBody  Inscription s)
    {
        return iInscriptionService.updateInscription(s);
    }
    @GetMapping("{id}")
    public Optional<Inscription> FindS(@PathVariable Long id)
    {
        return iInscriptionService.retrieveInscription(id);
    }
}
