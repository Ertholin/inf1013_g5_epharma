package ca.uqtr.inf1013_h22_g5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pharmacie", schema = "public")
public class Pharmacie extends AbstractEntity{

    private String nom;

    private String compagnie;

    @Embedded
    private Adresse adresse;

    private String numeroTelephone;

    private String heureOuverture;

    private int coteAvis;

    private String siteWeb;

    private String image;

    @ManyToOne
    @JoinColumn
    private Pharmacien pharmacien;

    @OneToMany(mappedBy = "pharmacie")
    private List<Medicament> medicaments;

    @OneToMany(mappedBy = "pharmacie")
    private List<DemandeClient> demandes;

}
