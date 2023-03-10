package com.esprit.ski_mehrez.Reposotory;

import com.esprit.ski_mehrez.Entities.Skieur;
import com.esprit.ski_mehrez.Entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public interface SkieurRepostory extends JpaRepository<Skieur,Long > {
    @Query("select s from Skieur s where s.abonnement.typeAbon = ?1")
    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);

}
