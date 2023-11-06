package tn.esprit.demo1_almehdi_bayoudh_4twin7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.foyer;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.universite;

import java.util.List;

public interface IFoyerRepository extends CrudRepository<foyer,Long> {

    foyer findByNomfoyer(String nomFoyer);
}
