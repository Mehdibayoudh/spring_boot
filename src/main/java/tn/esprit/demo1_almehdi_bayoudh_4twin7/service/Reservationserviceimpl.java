package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.reservation;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.universite;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IReservationRepo;

import java.util.List;
@AllArgsConstructor
@Service
public class Reservationserviceimpl implements IReservationservice{
    IReservationRepo reservationRepo ;

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


}
