package services;

import com.example.first.entities.chambre;
import com.example.first.entities.Foyer;
import com.example.first.entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation addReservation (Reservation reservation);
    void deleteReservation (Long idReservation);
    List<Reservation> getAllReservation();
    Reservation updateReservation (Reservation reservation );
}
