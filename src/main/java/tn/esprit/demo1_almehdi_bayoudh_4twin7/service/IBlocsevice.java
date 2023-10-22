package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;

import java.util.List;

public interface IBlocsevice {
    Bloc ajouterBloc(Bloc f);
    Bloc  updateBloc(Bloc f);
    void supprimerBloc(Long idblock);
    Bloc getBloc(Long idblock);
    List<Bloc> getallBloc();
}
