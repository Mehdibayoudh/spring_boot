package tn.esprit.demo1_almehdi_bayoudh_4twin7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.universite;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.service.IUniversiteservice;
import java.util.List;

@RequestMapping("Universite")
@RestController
@RequiredArgsConstructor
public class UniversiteRestControler {
    private final IUniversiteservice iUniversiteservice;
    @GetMapping("affiche")
    public List<universite> ulist(){
        return iUniversiteservice.getalluniversite();
    }
    @PostMapping("add")

    public universite adduniversite(@RequestBody universite u)
    {
        return iUniversiteservice.ajouterUniversite(u);
    }
    @DeleteMapping ("delete/{id}")

    public void deleteuniversite(@PathVariable long id)
    {
        iUniversiteservice.supprimeruniversite(id);
    }
    @PutMapping("update/{id}")
    public universite updatereuniversite(@PathVariable long id,@RequestBody universite u)
    {
        u.setIduniversite(id);
        return iUniversiteservice.update(u);

    }
    @PutMapping("affecteruniv/{idfoyer}/{nom}")
    public universite AffecterUnivAFoyer(@PathVariable long idfoyer, @PathVariable String nom )
    {
        return iUniversiteservice.affecterFoyerAUniversite(idfoyer,nom);
    }
    @PutMapping("deaffecteruniv/{idfoyer}/{idUniversite}")
    public universite DeaffecterUnivAFoyer(@PathVariable long idfoyer, @PathVariable long idUniversite )
    {
        return iUniversiteservice.desaffecterFoyerAUniversite(idfoyer,idUniversite);
    }


}
