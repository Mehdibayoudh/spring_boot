package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.universite;

import java.util.List;

public interface IUniversiteservice {
    universite ajouterUniversite(universite u);
    universite  update(universite u);
    void supprimeruniversite(long iduniversite);
    universite getuniversite(long iduniversite);
    List<universite> getalluniversite();
    universite findbyNomuniv(String nom);

       universite affecterFoyerAUniversite(long idFoyer, String nomUniversite);
    universite desaffecterFoyerAUniversite(long idFoyer, long idUniversite) ;
}
