package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IFoyerRepository;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
//@RequiredArgsConstructor en ajoute final
public class foyerserviceimpl implements iFoyerservice {
  //  @Autowired
    IFoyerRepository foyerRepository;

    @Override
    public foyer ajouterFoyer(foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public foyer update(foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public void supprimerfoyer(long idfoyer) {
        foyerRepository.deleteById(idfoyer);
    }

    @Override
    public foyer getfoyer(long idfoyer)
    {
        return foyerRepository.findById(idfoyer).orElseGet(null);
    }

    @Override
    public List<foyer> getallfoyer()
    {
        return (List<foyer>) foyerRepository.findAll();
    }
}
