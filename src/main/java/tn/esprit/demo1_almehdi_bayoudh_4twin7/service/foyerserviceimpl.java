package tn.esprit.demo1_almehdi_bayoudh_4twin7.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.universite;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IBlocRepo;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.IFoyerRepository;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.repository.Iuniversite;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
//@RequiredArgsConstructor en ajoute final
public class foyerserviceimpl implements iFoyerservice {
  //  @Autowired
    IFoyerRepository foyerRepository;
    Iuniversite iuniversite;
    IBlocRepo iBlocRepository;

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

    @Override
    public foyer ajouterFoyerEtAffecterAUniversite(foyer foyer, long idUniversite) {
  /*universite u = iuniversite.findById(idUniversite).orElse(null);
  u.setF(foyer);
  for(Bloc eBloc:foyer)*/
  return null;
    }

}
