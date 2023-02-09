package com.esprit.ski_mehrez.Controller;

import com.esprit.ski_mehrez.Entities.Moniteur;
import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Services.IMoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Moniteur")
public class MoniteurController {
    @Autowired
    IMoniteurService iMoniteurService;
    @GetMapping("retivveAllMoniteurs")
    public List<Moniteur> getall()
    {
        return iMoniteurService.retrieveAllMoniteurs();
    }
    @PostMapping

    public Moniteur addS(@RequestBody Moniteur s)
    {
        return iMoniteurService.addM(s);
    }
    @DeleteMapping("{id}")
    public void RemoveS(@PathVariable Long id) {
        iMoniteurService.RemoveMoniteur(id);
    }
    @PutMapping
    public Moniteur UpdateS(@RequestBody  Moniteur s)
    {
        return  iMoniteurService.updateMoniteur(s);
    }
    @GetMapping("{id}")
    public Optional<Moniteur> FindS(@PathVariable Long id)
    {

        return iMoniteurService.retrieveMoniteur(id);
    }
}
