package com.esprit.ski_mehrez.Controller;

import com.esprit.ski_mehrez.Entities.Cours;
import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Services.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Cours")
public class CoursController {
    @Autowired
    ICoursService iCoursService;
    @GetMapping("retivveAllCours")
    public List<Cours> getall()
    {
        return iCoursService.retrieveAllCours();
    }
    @PostMapping

    public Cours addS(@RequestBody Cours s)
    {
        return iCoursService.addC(s);
    }
    @DeleteMapping("{id}")
    public void RemoveS(@PathVariable Long id) {
        iCoursService.RemoveCour(id);
    }
    @PutMapping
    public Cours UpdateS(@RequestBody  Cours s)
    {
        return iCoursService.updateCour(s);
    }
    @GetMapping("{id}")
    public Optional<Cours> FindS(@PathVariable Long id)
    {
        return iCoursService.retrieveCour(id);
    }

}
