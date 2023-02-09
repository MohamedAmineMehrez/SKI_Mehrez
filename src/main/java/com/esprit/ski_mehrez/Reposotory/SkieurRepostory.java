package com.esprit.ski_mehrez.Reposotory;

import com.esprit.ski_mehrez.Entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
@Repository
public interface SkieurRepostory extends JpaRepository<Skieur,Long > {


}
