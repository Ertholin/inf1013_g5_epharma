package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Exemplaire;
import ca.uqtr.inf1013_h22_g5.model.Medicament;
import ca.uqtr.inf1013_h22_g5.model.Pharmacie;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExemplaireDTO {

    private Integer id;
    private Pharmacie pharmacie;
    private Medicament medicament;

    public static ExemplaireDTO fromEntity(Exemplaire exemplaire){
        if(exemplaire == null){
            return null;
        }
        return ExemplaireDTO.builder()
                .id(exemplaire.getId())
                .build();
    }

}

