package tn.esprit.demo1_almehdi_bayoudh_4twin7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.etudiant;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.service.IEtudiantservice;

import java.util.List;

@RequestMapping("Foyer")
@RestController
@RequiredArgsConstructor
public class EtudianRestControler {
    private final IEtudiantservice iEtudiantservice;
    @GetMapping("affiche")
    public List<etudiant> Elist(){
        return iEtudiantservice.getallEtudiant();
    }
    @PostMapping("add")

    public etudiant addetudiant(@RequestBody etudiant e)
    {
        return iEtudiantservice.ajouterEtudiant(e);
    }
    @DeleteMapping ("delete/{id}")

    public void deletestudent(@PathVariable long id)
    {
        iEtudiantservice.supprimerEtudiant(id);
    }
    @PutMapping("update/{id}")
    public etudiant updatestudent(@PathVariable int id,@RequestBody etudiant e)
    {
        e.setIdetudiant(id);
        return iEtudiantservice.updateEtudiant(e);

    }
}
