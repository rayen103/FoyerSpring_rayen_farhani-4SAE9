package com.example.first.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;
@Data
@Entity

public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc ;
    private String nomBloc ;
    private Long capaciteBloc;


    @OneToMany(mappedBy = "bloc")
    private Set<chambre> chambres;

    @ManyToOne
    private Foyer foyer;
}
