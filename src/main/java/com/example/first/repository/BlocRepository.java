package com.example.first.repository;
import com.example.first.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.first.entities.chambre;
@Repository

public interface BlocRepository extends JpaRepository<Bloc,Long >{

}
