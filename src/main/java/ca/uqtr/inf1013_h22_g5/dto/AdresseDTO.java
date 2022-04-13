package ca.uqtr.inf1013_h22_g5.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDTO {

    private int numeroCivil;

    private String nomRue;

    private String nomVille;

    private String nomProvince;

    private String codePostale;

    private String pays;

}
