package services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.first.entities.chambre;
import com.example.first.entities.Etudiant;
import com.example.first.repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl  implements IEtudiantService {
    EtudiantRepository etudiantRepositoryRepository ;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepositoryRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepositoryRepository.deleteById(idEtudiant);

    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepositoryRepository.findAll();
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepositoryRepository.save(etudiant);
    }
}
