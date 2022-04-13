package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Medicament;
import ca.uqtr.inf1013_h22_g5.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDTO {

    private Instant dateMvtStk;

    private BigDecimal quantite;

    private Medicament medicament;
    private TypeMvtStk typeMvtStk;

}
