package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Adresse;
import ca.uqtr.inf1013_h22_g5.model.Pharmacie;
import ca.uqtr.inf1013_h22_g5.model.Pharmacien;
import lombok.Builder;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class PharmacienDTO {

    private Integer id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String genre;
    private String image;

    private Adresse adresse;
    private List<Pharmacie> pharmacie;

    public static PharmacienDTO fromEntity(Pharmacien pharmacien){
        if(pharmacien == null){
            return null;
        }
        return PharmacienDTO.builder()
                .id(pharmacien.getId())
                .nom(pharmacien.getNom())
                .prenom(pharmacien.getPrenom())
                .dateNaissance(pharmacien.getDateNaissance())
                .genre(pharmacien.getGenre())
                .image(pharmacien.getImage())
                .build();
    }

    public static Pharmacien toEntity(PharmacienDTO pharmacienDTO){
        if(pharmacienDTO == null){
            return null;
        }
        Pharmacien pharmacien = new Pharmacien();
        pharmacien.setId(pharmacienDTO.getId());
        pharmacien.setNom(pharmacienDTO.getNom());
        pharmacien.setDateNaissance(pharmacienDTO.getDateNaissance());
        pharmacien.setGenre(pharmacienDTO.getGenre());
        pharmacien.setImage(pharmacienDTO.getImage());

        return pharmacien;
    }

}
