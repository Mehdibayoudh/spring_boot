package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.etudiant;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IEtudiantRepo;

import java.util.List;
@Service
@AllArgsConstructor
public class Etudiantserviceimpl implements IEtudiantservice{
    IEtudiantRepo etudiantRepo;
    @Override
    public etudiant ajouterEtudiant(etudiant e) {
        return etudiantRepo.save(e);
    }

    @Override
    public etudiant updateEtudiant(etudiant e) {
        return etudiantRepo.save(e);
    }

    @Override
    public void supprimerEtudiant(Long idetudiant) {
        etudiantRepo.deleteById(idetudiant);
    }

    @Override
    public etudiant getEtudiant(Long idetudiant) {
        return etudiantRepo.findById(idetudiant).orElseGet(null);
    }

    @Override
    public List<etudiant> getallEtudiant() {
        return (List<etudiant>) etudiantRepo.findAll();
    }
}
