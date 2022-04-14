package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDTO {

    private Integer id;

    private int numeroCivil;

    private String nomRue;

    private String nomVille;

    private String nomProvince;

    private String codePostale;

    private String pays;

    public static AdresseDTO fromEntity(Adresse adresse){
        if(adresse == null){
            return null;
        }

        return AdresseDTO.builder()
                .numeroCivil(adresse.getNumeroCivil())
                .nomProvince(adresse.getNomProvince())
                .nomRue(adresse.getNomRue())
                .nomVille(adresse.getNomVille())
                .nomProvince(adresse.getNomProvince())
                .codePostale(adresse.getCodePostale())
                .build();
    }

    public static Adresse toEntity(AdresseDTO adresseDTO){
        if(adresseDTO == null){
            return null;
        }
        Adresse adresse = new Adresse();
        adresse.setNumeroCivil(adresseDTO.getNumeroCivil());
        adresse.setNomProvince(adresseDTO.getNomProvince());
        adresse.setNomRue(adresseDTO.getNomRue());
        adresse.setNomVille(adresseDTO.getNomVille());
        adresse.setNomProvince(adresse.getNomProvince());
        adresse.setCodePostale(adresse.getCodePostale());
        return adresse;
    }



}
