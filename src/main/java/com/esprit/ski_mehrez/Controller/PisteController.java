package com.esprit.ski_mehrez.Controller;

import com.esprit.ski_mehrez.Entities.Piste;
import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Services.IPisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Pistes")
public class PisteController {
    @Autowired
    IPisteService iPisteService;
    @GetMapping("retivveAllPistes")
    public List<Piste> getall()
    {
        return iPisteService.retrieveAllPistes();
    }
    @PostMapping

    public Piste addS(@RequestBody Piste s)
    {
        return iPisteService.addP(s);
    }
    @DeleteMapping("{id}")
    public void RemoveS(@PathVariable Long id) {
        iPisteService.RemovePiste(id);
    }
    @PutMapping
    public Piste UpdateS(@RequestBody  Piste s)
    {
        return iPisteService.updatePiste(s);
    }
    @GetMapping("{id}")
    public Optional<Piste> FindS(@PathVariable Long id)
    {
        return iPisteService.retrievePiste(id);
    }
}
