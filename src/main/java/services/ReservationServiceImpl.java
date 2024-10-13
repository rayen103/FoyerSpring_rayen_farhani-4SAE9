package services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.first.entities.chambre;
import com.example.first.entities.Reservation;
import com.example.first.repository.ChambreRepository;
import com.example.first.repository.ReservationRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService{
    ReservationRepository reservationRepository ;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);

    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
