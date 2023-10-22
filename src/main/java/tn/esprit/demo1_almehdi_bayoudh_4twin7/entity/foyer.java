package tn.esprit.demo1_almehdi_bayoudh_4twin7.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class foyer  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idfoyer;
    private String nomfoyer;
    private long capcitefoyer;
    @OneToOne( mappedBy = "f")
    private universite u;
    @OneToMany(mappedBy = "foyer")
    Set<Bloc> blocs;
}
