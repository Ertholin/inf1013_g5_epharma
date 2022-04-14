package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Roles;
import ca.uqtr.inf1013_h22_g5.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDTO {
    private Integer id;
    private String rolename;
    private Utilisateur utilisateurs;


    public static RolesDTO fromEntity(Roles roles){
        if(roles == null){
            return null;
        }
        return RolesDTO.builder()
                .id(roles.getId())
                .rolename(roles.getRolename())
                .build();
    }

    public static Roles toEntity(RolesDTO rolesDTO){
        if(rolesDTO == null){
            return null;
        }
        Roles roles = new Roles();
        roles.setId(rolesDTO.getId());
        roles.setRolename(rolesDTO.getRolename());
        return roles;
    }

}
