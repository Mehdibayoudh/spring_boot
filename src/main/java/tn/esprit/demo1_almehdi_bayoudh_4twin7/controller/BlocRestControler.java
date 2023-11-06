package tn.esprit.demo1_almehdi_bayoudh_4twin7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.service.IBlocsevice;

import java.util.List;

@RequestMapping("Bloc")
@RestController
@RequiredArgsConstructor

public class BlocRestControler {
    private final IBlocsevice blocsevice;
    @GetMapping("affiche")
    public List<Bloc> Blist(){
        return blocsevice.getallBloc();
    }
    @PostMapping  ("add")

    public Bloc addbloc(@RequestBody Bloc b)
    {
        return blocsevice.ajouterBloc(b);
    }
        @DeleteMapping ("delete/{id}")

    public void deletebloc(@PathVariable long id)
    {
       blocsevice.supprimerBloc(id);
    }
    @PutMapping("update/{id}")
    public Bloc updatebloc(@PathVariable int id,@RequestBody Bloc b)
    {
        b.setIdbloc(id);
        return blocsevice.updateBloc(b);

    }
    @PutMapping("affecteChambre/{nom}")
    public Bloc affecterChambreBloc(@RequestBody List<Long>numChambre,@PathVariable String nom)
    {
        return blocsevice.affecterChambresABloc(numChambre,nom);
    }
    @PutMapping("affecterBlocAFoyer/{nomBloc}/{nomFoyer}")
    public Bloc affecterBlocAFoyer(@PathVariable  String nomBloc, @PathVariable String nomFoyer)
    {
        return blocsevice.affecterBlocAFoyer(nomBloc,nomFoyer);
    }

}
