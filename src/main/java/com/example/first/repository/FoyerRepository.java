package com.example.first.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.first.entities.chambre;
import com.example.first.entities.Foyer;
@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long > {
}
