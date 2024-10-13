package com.example.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.first.entities.Etudiant;
import  com.example.first.entities.chambre;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
