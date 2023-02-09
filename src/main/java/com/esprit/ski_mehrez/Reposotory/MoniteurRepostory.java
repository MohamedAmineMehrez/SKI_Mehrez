package com.esprit.ski_mehrez.Reposotory;

import com.esprit.ski_mehrez.Entities.Moniteur;
import com.esprit.ski_mehrez.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoniteurRepostory extends JpaRepository<Moniteur,Long > {
}
