package ca.uqtr.inf1013_h22_g5.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pharmacien")
@Data
public class Pharmacien {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String genre;
    private String image;

    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "pharmacien")
    private List<Pharmacie> pharmacie;

}
