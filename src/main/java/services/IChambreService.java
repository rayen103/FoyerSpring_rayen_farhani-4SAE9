package services;

import com.example.first.entities.chambre;

import java.util.List;

public interface IChambreService  {
    chambre addChambre (chambre chambre);
    void deleteChambre (Long idChamre);
    List <chambre> getAllChambre ();
    chambre updateChambre (chambre chambre);
}
