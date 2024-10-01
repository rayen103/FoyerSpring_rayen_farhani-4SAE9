package com.example.first.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Reservation implements Serializable {
    @Id
    private String idReservation; ;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToMany()
    private Set<Etudiant>etudiants;
}
