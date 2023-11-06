package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.TypeChambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.chambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IBlocRepo;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IChambreRepo;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IFoyerRepository;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class Chambreserviceimpl implements IChamberservice{
    IChambreRepo  chambreRepo;
    IBlocRepo  blocRepo;
    IFoyerRepository foyerRepository;
    @Override
    public chambre ajouterchambre(chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public chambre updatechambre(chambre c) {
        return chambreRepo.save(c);
    }

    @Override
    public void supprimerchambre(Long idchambre) {
        chambreRepo.deleteById(idchambre);
    }

    @Override
    public chambre getchambre(Long idchambre) {
        return chambreRepo.findById(idchambre).orElseGet(null);

    }

    @Override
    public List<chambre> getallchambre() {
        return (List<chambre>) chambreRepo.findAll();
    }

    @Override
    public List<chambre> getChambresParNomBloc(String nomBloc) {
        Bloc b = blocRepo.findByNombloc(nomBloc);
        List<chambre> chambres = new ArrayList<>();
        for(chambre c : b.getChambre()){
            chambres.add(c);

        }
        return chambres;
    }

    @Override
    public long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) {
        Bloc b = blocRepo.findById(idBloc).orElse(null);
        int nbrchambre = 0;
        for(chambre c : b.getChambre()){
            if (c.getTypeChambre()==type) {
                nbrchambre++;
            }
        }



        return  nbrchambre;
    }

    @Override
    public List<chambre> getChambresNonReserveParNomFoyerEtTypeChambre(String nomFoyer, TypeChambre type) {

        foyer foyer = foyerRepository.findByNomfoyer(nomFoyer);
        List<chambre> chambre = new ArrayList<>();
        List<Bloc> blocs = blocRepo.findByFoyer(foyer);
        for (Bloc b : blocs) {

            chambre.addAll(chambreRepo.findByTypeChambreAndBlocAndReservation(type,b,null));
        }




        return chambre;
    }
}
