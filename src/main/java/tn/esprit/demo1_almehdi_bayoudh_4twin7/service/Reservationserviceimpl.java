package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.chambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.reservation;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.etudiant;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.universite;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IChambreRepo;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IEtudiantRepo;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IReservationRepo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@AllArgsConstructor
@Service
public class Reservationserviceimpl implements IReservationservice{
    IReservationRepo reservationRepo ;
    IChambreRepo chambreRepository ;
    IEtudiantRepo etudiantRepository ;

    @Override
    public reservation ajouterreservation(reservation r) {



        return reservationRepo.save(r);
    }

    @Override
    public reservation updatereservation(reservation r) {
        return reservationRepo.save(r);
    }

    @Override
    public void supprimerreservation(Long idreservation) {
        reservationRepo.deleteById(idreservation);
    }

    @Override
    public reservation getreservation(Long idreservation) {
        return reservationRepo.findById(idreservation).orElseGet(null);

    }

    @Override
    public List<reservation> getallreservation() {

        return (List<reservation>) reservationRepo.findAll();
    }

    @Override
    @Transactional
    public reservation ajouterReservationEtAssignerAChambreEtAEtudiant(reservation res, Long numChambre, Long cin) {

        reservation resrvation = reservationRepo.findById(res.getIdReservation()).orElse(null);
        resrvation.setChamber(chambreRepository.findById(numChambre).orElse(null));
        resrvation.getEtudiant().add(etudiantRepository.findEtudiantByCin(cin));
        return resrvation;

    }

    @Override
    public long getReservationParAnneeUniversitaire(Date debutAnnee, Date finAnnee) {
       // List<reservation> reservation =  reservationRepo.findByAnneuniversitaireBetween(debutAnnee, finAnnee);
        return 5;
    }
    @Transactional
    @Override
    public reservation ajouterReservation(long idChambre, long cinEtudiant) {
        reservation r =new reservation();
        Date d = new Date("01-09"+ LocalDate.now().getYear());
        Date f = new Date("01-06"+ LocalDate.now().getYear()+1);
        r.setDebutanne(d);
        r.setFinanne(f);
        r.setEstValide(true);
          chambre c=  chambreRepository.findById(idChambre).orElse(null);
         long numchamber=  c.getNumerochambre();
         String nomBloc = c.getBloc().getNombloc();
        etudiant e=  etudiantRepository.findById(cinEtudiant).orElse(null);
         String nomBlc = e.getNomet();
         r.setNumReservation(numchamber+nomBlc+cinEtudiant);

        return r;
    }


}
