package tn.esprit.demo1_almehdi_bayoudh_4twin7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.TypeChambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.chambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.service.IChamberservice;

import java.util.List;

@RequestMapping("Chamber")
@RestController
@RequiredArgsConstructor
public class ChambreRestControler {
    private final IChamberservice iChamberservice;
    @GetMapping("affiche")
    public List<chambre> Clist(){
        return iChamberservice.getallchambre();
    }
    @PostMapping("add")

    public chambre addchamber(@RequestBody chambre c)
    {
        return iChamberservice.ajouterchambre(c);
    }
    @DeleteMapping ("delete/{id}")

    public void deletechamber(@PathVariable long id)
    {
        iChamberservice.supprimerchambre(id);
    }
    @PutMapping("update/{id}")
    public chambre updatechamber(@PathVariable int id,@RequestBody chambre c)
    {
        c.setIdchambre(id);
        return iChamberservice.updatechambre(c);

    }
    @GetMapping("getChambresParNomBloc/{nomBloc}")
    public List<chambre> getChambresParNomBloc(@PathVariable String nomBloc){
        return iChamberservice.getChambresParNomBloc(nomBloc);

    }

    @GetMapping("nbChambreParTypeEtBloc/{type}/{idbloc}")
    public long nbChambreParTypeEtBloc(@PathVariable TypeChambre type, @PathVariable long idbloc){
        return iChamberservice.nbChambreParTypeEtBloc(type,idbloc);

    }

    @GetMapping("getChambresNonReserveParNomFoyerEtTypeChambre/{nomFoyer}/{type}")
    public List<chambre> getChambresNonReserveParNomFoyerEtTypeChambre(@PathVariable String nomFoyer, @PathVariable TypeChambre type){
        return iChamberservice.getChambresNonReserveParNomFoyerEtTypeChambre(nomFoyer,type);

    }

}
