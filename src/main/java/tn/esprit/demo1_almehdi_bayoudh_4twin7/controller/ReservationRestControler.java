package tn.esprit.demo1_almehdi_bayoudh_4twin7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.reservation;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.service.IReservationservice;


import java.util.Date;
import java.util.List;

@RequestMapping("Reservation")
@RestController
@RequiredArgsConstructor
public class ReservationRestControler {
    private final IReservationservice iReservationservice;
    @GetMapping("affiche")
    public List<reservation> flist(){
        return iReservationservice.getallreservation();
    }
    @PostMapping("add")

    public reservation addreservation(@RequestBody reservation r)
    {
        return iReservationservice.ajouterreservation(r);
    }
    @DeleteMapping ("delete/{id}")

    public void deletereservation(@PathVariable long id)
    {
        iReservationservice.supprimerreservation(id);
    }
    @PutMapping("update/{id}")
    public reservation updatereservation(@PathVariable long id,@RequestBody reservation r)
    {
        r.setIdReservation(id);
        return iReservationservice.updatereservation(r);

    }
    @PutMapping("ajouterReservationEtAssignerAChambreEtAEtudiant/{numChambre}/{id_etudiant}")
    public reservation ajouterReservationEtAssignerAChambreEtAEtudiant( @RequestBody reservation r, @PathVariable long numChambre, @PathVariable long id_etudiant)
    {
        return iReservationservice.ajouterReservationEtAssignerAChambreEtAEtudiant(r,numChambre,id_etudiant);
    }
    @GetMapping("getReservationParAnneeUniversitaire/{debutAnnee}/{finAnnee}")
    public long getReservationParAnneeUniversitaire(
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date debutAnnee,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date finAnnee){
        return iReservationservice.getReservationParAnneeUniversitaire(debutAnnee, finAnnee);
    }
}
