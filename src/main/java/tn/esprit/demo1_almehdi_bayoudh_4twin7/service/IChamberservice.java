package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.TypeChambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.chambre;

import java.util.List;

public interface IChamberservice {
    chambre ajouterchambre(chambre c);
    chambre  updatechambre(chambre c);
    void supprimerchambre(Long idchambre);
    chambre getchambre(Long idchambre);
    List<chambre> getallchambre();
    List<chambre> getChambresParNomBloc( String nomBloc) ;
    long nbChambreParTypeEtBloc(TypeChambre type, long idBloc) ;
    List<chambre> getChambresNonReserveParNomFoyerEtTypeChambre( String nomFoyer,TypeChambre type) ;
}
