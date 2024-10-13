package services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.first.entities.chambre;
import com.example.first.repository.ChambreRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImpl  implements IChambreService{
    ChambreRepository chambreRepository ;
    @Override
    public chambre addChambre(chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChamre) {
        chambreRepository.deleteById(idChamre);

    }

    @Override
    public List<chambre> getAllChambre() {

        return chambreRepository.findAll();
    }

    @Override
    public chambre updateChambre(chambre chambre) {

        return chambreRepository.save(chambre);
    }
}
