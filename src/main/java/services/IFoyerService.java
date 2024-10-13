package services;

import com.example.first.entities.Bloc;
import com.example.first.entities.chambre;
import com.example.first.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer (Foyer foyer );
    void deleteFoyer (Long idFoyer);
    List<Foyer> getAllFoyer();
    Foyer updateFoyer (Foyer foyer );
}
