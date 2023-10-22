package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;

import java.util.List;

public interface iFoyerservice {
    foyer  ajouterFoyer(foyer f);
    foyer  update(foyer f);
    void supprimerfoyer(long idfoyer);
    foyer getfoyer(long idfoyer);
    List<foyer> getallfoyer();
}
