package ca.uqtr.inf1013_h22_g5.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Demande {

    @Id
    @GeneratedValue
    private Long ID;
    private Long numero;
    private EtatDemande etat;
    private String sujet;
    private String description;
    private String reponse;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Pharmacie pharmacie;

}
