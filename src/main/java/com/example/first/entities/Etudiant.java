package com.example.first.entities;

import com.example.first.entities.Reservation;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idE ;
    private Long cin ;
    private String nomEt ;
    private String prenomEt ;
    private String ecole ;
    private Date dateNaissence;


    @ManyToMany(mappedBy = "etudiants")
    private Set<Reservation> reservations ;
}
