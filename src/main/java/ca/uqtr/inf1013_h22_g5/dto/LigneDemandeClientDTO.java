package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.DemandeClient;
import ca.uqtr.inf1013_h22_g5.model.Medicament;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
public class LigneDemandeClientDTO {

    private Medicament medicament;

    private DemandeClient demandeClient;
}
