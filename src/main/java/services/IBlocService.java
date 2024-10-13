package services;
import com.example.first.entities.Bloc;
import com.example.first.entities.chambre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IBlocService {
    Bloc addBloc (Bloc bloc );
    void deleteBloc (Long idBloc);
    List<Bloc> getAllBloc();
    Bloc updateBloc (Bloc bloc);
}
