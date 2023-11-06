package tn.esprit.demo1_almehdi_bayoudh_4twin7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.etudiant;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.service.IEtudiantservice;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.service.iFoyerservice;

import java.util.List;

@RequestMapping("Etudiant")
@RestController
@RequiredArgsConstructor
public class FoyerRestControler {
    private final iFoyerservice iFoyerservice;
    @GetMapping("afficheliste/{id}")
    public foyer getfoyer(@PathVariable long id)
    {
       return iFoyerservice.getfoyer(id);
    }
    @GetMapping("affiche")
    public List<foyer> flist(){
        return iFoyerservice.getallfoyer();
    }
    @PostMapping("add")

    public foyer addfoyer(@RequestBody foyer f)
    {
        return iFoyerservice.ajouterFoyer(f);
    }
    @DeleteMapping ("delete/{id}")

    public void deletefoyer(@PathVariable long id)
    {
        iFoyerservice.supprimerfoyer(id);
    }
    @PutMapping("update/{id}")
    public foyer updatefoyer(@PathVariable int id,@RequestBody foyer f)
    {
        f.setIdfoyer(id);
        return iFoyerservice.update(f);

    }
}
