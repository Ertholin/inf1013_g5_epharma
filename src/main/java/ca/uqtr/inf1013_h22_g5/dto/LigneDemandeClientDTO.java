package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.DemandeClient;
import ca.uqtr.inf1013_h22_g5.model.Medicament;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneDemandeClientDTO {

    private Integer id;
    private Medicament medicament;
    private DemandeClient demandeClient;
}
