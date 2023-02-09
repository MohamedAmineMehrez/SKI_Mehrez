package com.esprit.ski_mehrez.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private Integer niveau ;
    private TypeCours typeCours;
    private Support support;
    private Float prix;
    private Integer creneau;
    @OneToMany(mappedBy = "cour",cascade = CascadeType.REMOVE)
    private List<Inscription> inscriptions;

}
