package tn.esprit.demo1_almehdi_bayoudh_4twin7.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.chambre;

public interface IChambreRepo extends CrudRepository<chambre,Long> {
}
