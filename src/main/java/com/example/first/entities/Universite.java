package com.example.first.entities;

import com.example.first.entities.Foyer;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idU; ;
    private String nomU;
    private String adresse;

    @OneToOne
    private Foyer foyer;
}
