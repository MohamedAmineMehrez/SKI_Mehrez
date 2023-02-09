package com.esprit.ski_mehrez.Reposotory;

import com.esprit.ski_mehrez.Entities.Inscription;
import com.esprit.ski_mehrez.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepostory extends JpaRepository<Inscription,Long > {
}
