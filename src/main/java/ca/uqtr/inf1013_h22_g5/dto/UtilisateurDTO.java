package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Adresse;
import ca.uqtr.inf1013_h22_g5.model.Roles;
import ca.uqtr.inf1013_h22_g5.model.Utilisateur;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDTO {

    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String photo;
    private Instant dateNaissance;
    private Adresse adresse;
    private List<Roles> roles;

    public static UtilisateurDTO fromEntity(Utilisateur utilisateur){
        if(utilisateur == null){
            return null;
        }
        return UtilisateurDTO.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .email(utilisateur.getEmail())
                .photo(utilisateur.getPhoto())
                .dateNaissance(utilisateur.getDateNaissance())
                .build();
    }

    public static Utilisateur toEntity(UtilisateurDTO utilisateurDTO){
        if(utilisateurDTO == null){
            return null;
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDTO.getId());
        utilisateur.setNom(utilisateurDTO.getNom());
        utilisateur.setPrenom(utilisateurDTO.getPrenom());
        utilisateur.setEmail(utilisateurDTO.getEmail());
        utilisateur.setPhoto(utilisateurDTO.getPhoto());
        utilisateur.setDateNaissance(utilisateurDTO.getDateNaissance());

        return utilisateur;
    }

}
