package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Medicament;
import ca.uqtr.inf1013_h22_g5.model.MvtStk;
import ca.uqtr.inf1013_h22_g5.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDTO {

    private Integer id;
    private Instant dateMvtStk;
    private BigDecimal quantite;
    private Medicament medicament;
    private TypeMvtStk typeMvtStk;

    public static MvtStkDTO fromEntity(MvtStk mvtStk) {
        if (mvtStk == null) {
            return null;
        }
        return MvtStkDTO.builder()
                .id(mvtStk.getId())
                .dateMvtStk(mvtStk.getDateMvtStk())
                .quantite(mvtStk.getQuantite())
                .typeMvtStk(mvtStk.getTypeMvtStk())
                .build();
    }

    public static MvtStk toEntity(MvtStkDTO mvtStkDto){
        if(mvtStkDto == null){
            return null;
        }
        MvtStk mvtStk = new MvtStk();
        mvtStk.setId(mvtStkDto.getId());
        mvtStk.setDateMvtStk(mvtStkDto.getDateMvtStk());
        mvtStk.setQuantite(mvtStkDto.getQuantite());
        mvtStk.setTypeMvtStk(mvtStkDto.getTypeMvtStk());
        return mvtStk;
    }

}
