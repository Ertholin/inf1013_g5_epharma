package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Adresse;
import ca.uqtr.inf1013_h22_g5.model.DemandeClient;
import ca.uqtr.inf1013_h22_g5.model.Medicament;
import ca.uqtr.inf1013_h22_g5.model.Pharmacien;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class PharmacieDTO {

    private Integer id;

    private String nom;

    private String compagnie;

    private Adresse adresse;

    private String numeroTelephone;

    private String heureOuverture;

    private int coteAvis;

    private String siteWeb;

    private Long image;

    private Pharmacien pharmacien;

    private List<Medicament> medicaments;

    private List<DemandeClient> demandes;

}
