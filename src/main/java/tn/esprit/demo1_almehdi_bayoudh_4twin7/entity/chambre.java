package tn.esprit.demo1_almehdi_bayoudh_4twin7.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter

public class chambre  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idchambre;
    private long numerochambre;
    private TypeChambre typeChambre;
    @ManyToOne
    private Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<reservation> reservation;
}
