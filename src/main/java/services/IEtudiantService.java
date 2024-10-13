package services;

import com.example.first.entities.Etudiant;
import com.example.first.entities.chambre;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant (Etudiant etudiant);
    void deleteEtudiant(Long idEtudiant);
    List<Etudiant> getAllEtudiant ();
    Etudiant updateEtudiant (Etudiant etudiant);
}
