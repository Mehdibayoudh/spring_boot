package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.universite;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IReservationRepo;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.Iuniversite;

import java.util.List;
@AllArgsConstructor
@Service
public class Universiteserviceimpl implements IUniversiteservice{
    Iuniversite iuniversite ;
    @Override
    public universite ajouterUniversite(universite u) {
        return iuniversite.save(u);
    }

    @Override
    public universite update(universite u) {
        return iuniversite.save(u);
    }

    @Override
    public void supprimeruniversite(long iduniversite) {
        iuniversite.deleteById(iduniversite);
    }

    @Override
    public universite getuniversite(long iduniversite) {
        return iuniversite.findById(iduniversite).orElseGet(null);
    }

    @Override
    public List<universite> getalluniversite() {
        return (List<universite>) iuniversite.findAll();    }
}
