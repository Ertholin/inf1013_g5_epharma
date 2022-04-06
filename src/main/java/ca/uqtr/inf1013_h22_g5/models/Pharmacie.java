package ca.uqtr.inf1013_h22_g5.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pharmacie {

    @Id
    @GeneratedValue
    private Long ID;
    private String nom;
    private String compagnie;
    //private Adresse adresse;
    private String numeroTelephone;
    private String heureOuverture;
    private int coteAvis;
    private Long image;
    //private List<Medicament> medicaments;

    @OneToMany(mappedBy = "pharmacie")
    private List<Demande> demandes;

    @ManyToOne
    @JoinColumn
    private Pharmacien pharmacien;
}
