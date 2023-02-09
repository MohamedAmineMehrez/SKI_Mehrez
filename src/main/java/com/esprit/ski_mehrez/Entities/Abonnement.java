package com.esprit.ski_mehrez.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Float prixAbon;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;

}
