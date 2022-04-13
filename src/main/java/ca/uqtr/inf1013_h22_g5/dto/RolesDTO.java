package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDTO {


    private Integer id;

    private String rolename;
    private Utilisateur utilisateurs;

}
