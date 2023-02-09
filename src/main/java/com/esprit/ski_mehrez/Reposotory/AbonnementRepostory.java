package com.esprit.ski_mehrez.Reposotory;

import com.esprit.ski_mehrez.Entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonnementRepostory extends JpaRepository<Abonnement,Long > {
}
