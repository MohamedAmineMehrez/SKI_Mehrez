package com.esprit.ski_mehrez.Reposotory;

import antlr.collections.List;
import com.esprit.ski_mehrez.Entities.Cours;
import com.esprit.ski_mehrez.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepostory extends JpaRepository<Cours,Long > {

}
