package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.chambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.etudiant;

import java.util.List;

public interface IEtudiantservice {
    etudiant ajouterEtudiant(etudiant e);
    etudiant  updateEtudiant(etudiant e);
    void supprimerEtudiant(Long idetudiant);
    etudiant getEtudiant(Long idetudiant);
    List<etudiant> getallEtudiant();
}
