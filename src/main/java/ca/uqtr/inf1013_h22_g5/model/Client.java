package ca.uqtr.inf1013_h22_g5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Client extends AbstractEntity{

    private String nom;
    private String prenom;
    private String email;
    private Date dateNaissance;
    private String genre;
    private String image;

    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "client")
    private List<DemandeClient> demandeClients;
}
