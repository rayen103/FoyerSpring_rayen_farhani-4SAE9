package com.example.foyer_springboot.services;

import com.example.foyer_springboot.entities.Bloc;
import com.example.foyer_springboot.entities.Chambre;
import com.example.foyer_springboot.repositories.BlocRepository;
import com.example.foyer_springboot.repositories.ChambreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BlocServiceImpl implements IBlocService{

    BlocRepository blocRepository;
    ChambreRepository chambreRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBlocById(Long id) {
        return blocRepository.findById(id).get();
    }

    public Integer countByCapaciteBlocGreaterThan(Long capacite){
        return blocRepository.countByCapaciteBlocGreaterThan(capacite);
    }
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        Bloc b = blocRepository.findById(idBloc).get();
        numChambre.forEach(num ->{
            Chambre chambre = chambreRepository.findByNumeroChambre(num);
            chambre.setBloc(b);
            chambreRepository.save(chambre);
        });
        return b;
    }
  public Bloc  findBlocsByIdBloc(long idBloc){
        return blocRepository.findBlocsByIdBloc(idBloc);
  }
}
