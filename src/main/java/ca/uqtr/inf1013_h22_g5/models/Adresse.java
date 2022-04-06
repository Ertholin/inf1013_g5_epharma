package ca.uqtr.inf1013_h22_g5.models;

import lombok.Data;

@Data
public class Adresse {

    private int numeroCivil;

    private String nomRue;

    private String nomVille;

    private String nomProvince;

    private String codePostale;

    private String pays;
}
