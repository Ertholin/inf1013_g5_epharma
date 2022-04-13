package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Adresse;
import ca.uqtr.inf1013_h22_g5.model.DemandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class ClientDTO {

    private Integer id;

    private String nom;
    private String prenom;
    private String email;
    private Date dateNaissance;
    private String genre;
    private String image;

    private Adresse adresse;
    private List<DemandeClient> demandeClients;

}
