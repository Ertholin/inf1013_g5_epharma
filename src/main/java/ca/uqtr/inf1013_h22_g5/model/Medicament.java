package ca.uqtr.inf1013_h22_g5.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "medicament", schema = "public")
public class Medicament extends AbstractEntity{

    private String nom;

    private String description;

    private String marque;

    private String format;

    private double prix;

    private String codeProduit;

    private String posologie;

    private String ingredient;

    private String avertissement;

    private String image;

    @ManyToOne
    @JoinColumn(name = "idPharmacie")
    private Pharmacie pharmacie;

    @OneToMany(mappedBy = "medicament")
    private List<LigneDemandeClient> ligneDemandeClientList;

    @OneToMany(mappedBy = "medicament")
    private List<Exemplaire> exemplaires;

}
