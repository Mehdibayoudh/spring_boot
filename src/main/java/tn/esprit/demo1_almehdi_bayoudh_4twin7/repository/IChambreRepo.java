package tn.esprit.demo1_almehdi_bayoudh_4twin7.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.TypeChambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.chambre;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.reservation;

import java.util.Collection;

public interface IChambreRepo extends CrudRepository<chambre,Long> {
    Collection<? extends chambre> findByTypeChambreAndBlocAndReservation(TypeChambre type, Bloc b, Object o);

    chambre findchambreBy(reservation re);
}
