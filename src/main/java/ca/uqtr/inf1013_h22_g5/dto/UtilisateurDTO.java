package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Adresse;
import ca.uqtr.inf1013_h22_g5.model.Roles;
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


}
