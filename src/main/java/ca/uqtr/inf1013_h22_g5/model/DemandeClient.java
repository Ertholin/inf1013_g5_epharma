package ca.uqtr.inf1013_h22_g5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemandeClient extends AbstractEntity{

    private Long numero;
    private String code;
    private EtatDemande etat;
    private String sujet;
    private String description;
    private String reponse;

    private Instant dateDemande;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Pharmacie pharmacie;

    @OneToMany(mappedBy = "demandeClient")
    private List<LigneDemandeClient> ligneDemandeClients;

}
