package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Client;
import ca.uqtr.inf1013_h22_g5.model.EtatDemande;
import ca.uqtr.inf1013_h22_g5.model.LigneDemandeClient;
import ca.uqtr.inf1013_h22_g5.model.Pharmacie;
import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class DemandeClientDTO {

    private Long numero;
    private String code;
    private EtatDemande etat;
    private String sujet;
    private String description;
    private String reponse;

    private Instant dateDemande;

    private Client client;

    private Pharmacie pharmacie;

    private List<LigneDemandeClient> ligneDemandeClients;

}
