package tn.esprit.demo1_almehdi_bayoudh_4twin7.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter

public class reservation implements Serializable {
    @Id
    private Long  idReservation;
    private Date debutanne;
    private Date finanne;
    private String numReservation;
    private boolean estValide;
    @JsonIgnore
    @ManyToOne
    private chambre chamber;
    @JsonIgnore
    @ManyToMany(mappedBy = "reservations")
    Set<etudiant> etudiant;
}
