package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.*;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class DemandeClientDTO {

    private Integer id;
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

    public static DemandeClientDTO fromEntity(DemandeClient demandeClient){
        if (demandeClient == null){
            return null;
        }
        return DemandeClientDTO.builder()
                .id(demandeClient.getId())
                .numero(demandeClient.getNumero())
                .code(demandeClient.getCode())
                .etat(demandeClient.getEtat())
                .sujet(demandeClient.getSujet())
                .description(demandeClient.getDescription())
                .reponse(demandeClient.getReponse())
                .dateDemande(demandeClient.getDateDemande())
                .build();
    }

    public static DemandeClient toEntity(DemandeClientDTO demandeClientDTO){
        if(demandeClientDTO == null){
            return null;
        }
        DemandeClient demandeClient = new DemandeClient();
        demandeClient.setId(demandeClientDTO.getId());
        demandeClient.setNumero(demandeClientDTO.getNumero());
        demandeClient.setCode(demandeClientDTO.getCode());
        demandeClient.setEtat(demandeClientDTO.getEtat());
        demandeClient.setSujet(demandeClientDTO.getSujet());
        demandeClient.setDescription(demandeClientDTO.getDescription());
        demandeClient.setReponse(demandeClientDTO.getReponse());
        demandeClient.setDateDemande(demandeClientDTO.getDateDemande());

        return demandeClient;
    }

}
