package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IBlocRepo;

import java.util.List;
@Service
@AllArgsConstructor
public class Blocserviceimpl implements IBlocsevice{
    IBlocRepo blocRepo;
    @Override
    public Bloc ajouterBloc(Bloc B) {
        return blocRepo.save(B);
    }

    @Override
    public Bloc updateBloc(Bloc B) {
        return blocRepo.save(B);
    }

    @Override
    public void supprimerBloc(Long idblock) {
        blocRepo.deleteById(idblock);
    }

    @Override
    public Bloc getBloc(Long idblock) {
        return blocRepo.findById(idblock).orElseGet(null);
    }


    @Override
    public List<Bloc> getallBloc() {
        return (List<Bloc>) blocRepo.findAll();
    }
}
