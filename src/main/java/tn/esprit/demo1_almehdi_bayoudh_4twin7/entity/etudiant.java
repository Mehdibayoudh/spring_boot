package tn.esprit.demo1_almehdi_bayoudh_4twin7.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter

public class etudiant  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idetudiant;
    private String nomet;
    private String prenomet;
    private long cin;
    private String ecole;
    private Date datenaissance;
    @ManyToMany
    private Set<reservation> reservations;
}
