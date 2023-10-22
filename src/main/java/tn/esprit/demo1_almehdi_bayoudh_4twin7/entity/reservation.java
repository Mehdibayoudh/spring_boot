package tn.esprit.demo1_almehdi_bayoudh_4twin7.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter

public class reservation implements Serializable {
    @Id
    private Long  idReservation;
    private String anneuniversitaire;
    private boolean estValide;
    @ManyToMany(mappedBy = "reservations")
    Set<etudiant> etudiant;
}
