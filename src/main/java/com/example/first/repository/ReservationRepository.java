package com.example.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.first.entities.Foyer;
import com.example.first.entities.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long > {
}
