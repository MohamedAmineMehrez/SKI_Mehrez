package com.esprit.ski_mehrez.Reposotory;

import com.esprit.ski_mehrez.Entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public interface SkieurRepostory extends JpaRepository<Skieur,Long > {
    @Query("select s from Skieur s where s.abonnement.typeAbon = ?1")//jpql (on remplace ?1 par :typeabon
    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);
    //si on utilise :typeabon @Param("typeabon") fl fonction
    //si on utlise sql e add at the end of query nativeQuery=true w 3awed query type sql
    //select * frome s where s.abonnement.typeABon
    //key words fiiha limite lil les relations bi directionnel
    //les skieurili 3andhom type cour particilier et support ski et coulour vert
    //les varable lazem minuscule w ila mch bch yi5dim
    List<Skieur> findByInscriptionsCourTypeCoursAndInscriptionsCourSupportAndPistesCoulour(TypeCours inscriptions_cour_typeCours, Support inscriptions_cour_support, Coulour pistes_coulour);
     @Query(value = "SELECT *\n" +
             "FROM skieur s JOIN inscription i ON i.skieur_num_skieur=s.num_skieur\n" +
             "JOIN cours c ON c.num_cours=i.cour_num_cours \n" +
             "JOIN moniteur_cours mc ON c.num_cours= mc.moniteur_num_moniteur\n" +
             "JOIN moniteur m ON m.num_moniteur=mc.moniteur_num_moniteur\n" +
             "where c.support=:supp AND m.nomm=:nom",nativeQuery = true)
    List<Skieur> findbybsSQL(@Param("supp")Support sup,@Param("nom") String nom);
@Query(value = "select s from Skieur s join Inscription i on i.skieur=s " +
        "join Moniteur m on i.cour member of m.cours where m.nomM=:nom and i.cour.support=:supp")
    List<Skieur> findbybsjbql(@Param("supp")Support sup,@Param("nom") String nom);
}
