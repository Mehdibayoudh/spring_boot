package tn.esprit.demo1_almehdi_bayoudh_4twin7.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Getter
@Setter
public class universite  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iduniversite;
    @Column(unique = true)
    private String nomuniversite;
    private String  adress;
    @OneToOne
    private foyer f;
}
