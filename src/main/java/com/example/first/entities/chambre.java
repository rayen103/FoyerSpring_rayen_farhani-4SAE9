package com.example.first.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
public class chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idC;
    private String numC;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC ;

    //declarer une liste des reservations
    @OneToMany
    private Set<Reservation> reservations;

    @ManyToOne
    private Bloc bloc;

}
