package ca.uqtr.inf1013_h22_g5.models;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String genre;
    private String image;

    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "client")
    private List<Demande> demandes;
}
