package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Exemplaire;
import ca.uqtr.inf1013_h22_g5.model.LigneDemandeClient;
import ca.uqtr.inf1013_h22_g5.model.Pharmacie;
import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class MedicamentDTO {


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
    private Pharmacie pharmacie;

    private List<LigneDemandeClient> ligneDemandeClientList;
    private List<Exemplaire> exemplaires;

}
