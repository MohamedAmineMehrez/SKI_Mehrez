package com.esprit.ski_mehrez.Reposotory;

import com.esprit.ski_mehrez.Entities.Abonnement;
import com.esprit.ski_mehrez.Entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Repository
public interface AbonnementRepostory extends JpaRepository<Abonnement,Long > {
   // List<Abonnement> findByTypeAbon(TypeAbonnement typeAbonnement);
    Set<Abonnement> findByTypeAbon(TypeAbonnement type);
    List<Abonnement> findByDateDebutAfterAndAndDateFinBefore(LocalDate DateDebut,LocalDate DateFin);
}
