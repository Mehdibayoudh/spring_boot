package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.universite;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IFoyerRepository;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IReservationRepo;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.Iuniversite;

import java.util.List;
@AllArgsConstructor
@Service
public class Universiteserviceimpl implements IUniversiteservice{
    Iuniversite iuniversite ;
    IFoyerRepository foyerRepository;

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
    public universite findbyNomuniv(String nom) {
        return iuniversite.findByNomuniversite(nom);
    }
    @Override
    @Transactional
    public universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        foyer f = foyerRepository.findById(idFoyer).orElse(null);
        universite uni = iuniversite.findByNomuniversite(nomUniversite);
        if (f != null && uni != null) {
            uni.setF(f);
            return uni;

        }
        return null;
    }

    @Override
    @Transactional
    public universite desaffecterFoyerAUniversite(long idFoyer, long idUniversite) {
        foyer f = foyerRepository.findById(idFoyer).orElse(null);
        universite u = iuniversite.findById(idUniversite).orElse(null);
        if (f != null && u != null) {
            u.setF(null);
            return u;
        }

        return null;
    }

    @Override
    public List<universite> getalluniversite() {
        return (List<universite>) iuniversite.findAll();    }



}
