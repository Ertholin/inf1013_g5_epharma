package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.*;
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
    private String image;

    private Pharmacien pharmacien;
    private List<Medicament> medicaments;
    private List<DemandeClient> demandes;

    public static PharmacieDTO fromEntity(Pharmacie pharmacie){
        if(pharmacie == null){
            return null;
        }
        return PharmacieDTO.builder()
                .id(pharmacie.getId())
                .nom(pharmacie.getNom())
                .compagnie(pharmacie.getCompagnie())
                .numeroTelephone(pharmacie.getNumeroTelephone())
                .heureOuverture(pharmacie.getHeureOuverture())
                .coteAvis(pharmacie.getCoteAvis())
                .siteWeb(pharmacie.getSiteWeb())
                .image(pharmacie.getImage())
                .build();
    }

    public static Pharmacie toEntity(PharmacieDTO pharmacieDTO){
        if(pharmacieDTO == null){
            return null;
        }
        Pharmacie pharmacie = new Pharmacie();
        pharmacie.setId(pharmacieDTO.getId());
        pharmacie.setNom(pharmacieDTO.getNom());
        pharmacie.setCompagnie(pharmacieDTO.getCompagnie());
        pharmacie.setNumeroTelephone(pharmacieDTO.getNumeroTelephone());
        pharmacie.setHeureOuverture(pharmacieDTO.getHeureOuverture());
        pharmacie.setCoteAvis(pharmacieDTO.getCoteAvis());
        pharmacie.setSiteWeb(pharmacieDTO.getSiteWeb());
        pharmacie.setImage(pharmacieDTO.getImage());

        return pharmacie;
    }

}
