package tn.esprit.demo1_almehdi_bayoudh_4twin7.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.etudiant;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;

import java.util.List;

public interface IBlocRepo extends CrudRepository<Bloc,Long> {
    Bloc findByNombloc(String nombloc);
    List<Bloc> findByFoyer(foyer foyer);
}
