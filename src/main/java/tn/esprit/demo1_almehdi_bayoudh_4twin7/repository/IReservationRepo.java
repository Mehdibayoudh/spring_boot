package tn.esprit.demo1_almehdi_bayoudh_4twin7.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.Bloc;
import tn.esprit.demo1_almehdi_bayoudh_4twin7.entity.reservation;

public interface IReservationRepo extends CrudRepository<reservation,Long> {
}
