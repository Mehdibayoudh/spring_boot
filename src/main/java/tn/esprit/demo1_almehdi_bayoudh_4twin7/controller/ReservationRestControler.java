package tn.esprit.demo1_almehdi_bayoudh_4twin7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.reservation;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.service.IReservationservice;


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
}
