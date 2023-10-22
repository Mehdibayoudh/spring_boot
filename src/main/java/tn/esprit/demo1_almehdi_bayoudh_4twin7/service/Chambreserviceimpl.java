package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.chambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IBlocRepo;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IChambreRepo;

import java.util.List;
@Service
@AllArgsConstructor
public class Chambreserviceimpl implements IChamberservice{
    IChambreRepo  chambreRepo;
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
}
