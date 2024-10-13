package com.example.first.repository;
import com.example.first.entities.chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ChambreRepository extends JpaRepository<chambre,Long> {


}
