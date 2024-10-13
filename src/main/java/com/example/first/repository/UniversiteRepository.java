package com.example.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.first.entities.Reservation;
import com.example.first.entities.Universite;
@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long > {

}
