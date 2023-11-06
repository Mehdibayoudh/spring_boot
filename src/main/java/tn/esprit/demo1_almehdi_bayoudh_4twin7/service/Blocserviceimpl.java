package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.chambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IBlocRepo;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IChambreRepo;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IFoyerRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class Blocserviceimpl implements IBlocsevice{
    IBlocRepo blocRepo;
    IChambreRepo chambreRepo;
    IFoyerRepository foyerRepository;
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

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, String nomBloc) {
        Bloc b = blocRepo.findByNombloc(nomBloc);
        for(Long id : numChambre){
            chambre c = chambreRepo.findById(id).orElse(null);
            c.setBloc(b);
        }
        return b;
    }
@Transactional
    @Override
    public Bloc affecterBlocAFoyer(String nomBloc, String nomFoyer) {
        Bloc b = blocRepo.findByNombloc(nomBloc);
        foyer f = foyerRepository.findByNomfoyer(nomFoyer);
        b.setFoyer(f);
        return b;
    }
}
