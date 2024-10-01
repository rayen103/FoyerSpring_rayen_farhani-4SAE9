package com.example.first.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;
@Data
@Entity
public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idF ;
    private String nomF ;
    private Long capaciteF;

    @OneToOne(mappedBy = "foyer")
    private Universite universiteF;

    @OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;

}
