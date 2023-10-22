package tn.esprit.demo1_almehdi_bayoudh_4twin7.entity;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter

public class Bloc  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idbloc;
    private String nombloc;
    private long capacitebloc;
    @ManyToOne
    private foyer foyer;
    @OneToMany(mappedBy = "bloc")
    Set<chambre> chambre ;
}
