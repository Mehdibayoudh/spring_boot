package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.reservation;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.universite;

import java.util.Date;
import java.util.List;

public interface IReservationservice {
    reservation ajouterreservation(reservation r);
    reservation  updatereservation(reservation r);
    void supprimerreservation(Long idreservation);
    reservation getreservation(Long idreservation);
    List<reservation> getallreservation();
    reservation ajouterReservationEtAssignerAChambreEtAEtudiant (reservation res, Long numChambre, Long cin) ;
    long getReservationParAnneeUniversitaire(Date debutAnnee, Date finAnnee ) ;
    public reservation ajouterReservation (long idChambre, long cinEtudiant) ;
}
