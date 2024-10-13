package services;

import com.example.first.entities.chambre;
import com.example.first.entities.Reservation;
import com.example.first.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite (Universite universite);
    void deleteUniversite (Long idUniversite);
    List<Universite> getAllUniversite();
    Universite updateUniversite(Universite universite );
}
