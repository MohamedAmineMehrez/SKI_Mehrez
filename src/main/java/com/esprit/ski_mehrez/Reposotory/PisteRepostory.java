package com.esprit.ski_mehrez.Reposotory;

import com.esprit.ski_mehrez.Entities.Piste;
import com.esprit.ski_mehrez.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PisteRepostory extends JpaRepository<Piste,Long > {
}
