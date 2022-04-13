package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Adresse;
import ca.uqtr.inf1013_h22_g5.model.Pharmacie;
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

}
