package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Foyer;
import com.example.foyer_springboot.entities.Universite;
import com.example.foyer_springboot.repositories.FoyerRepository;
import com.example.foyer_springboot.repositories.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{

    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
    public Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite) {
        Foyer f = foyerRepository.findById(idFoyer).get();
        Universite u = universiteRepository.findByNomUniversite(nomUniversite);
        u.setFoyer(f);
        universiteRepository.save(u);
        return u;
    }
    public Universite desaffecterFoyerAUniversite (long idUniversite) {
        Universite u = universiteRepository.findById(idUniversite).get();
        u.setFoyer(null);
        universiteRepository.save(u);
        return u;
    }

}
