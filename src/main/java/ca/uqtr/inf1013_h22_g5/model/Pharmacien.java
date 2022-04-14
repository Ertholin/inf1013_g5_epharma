package ca.uqtr.inf1013_h22_g5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pharmacien", schema = "public")
public class Pharmacien extends AbstractEntity{

    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String genre;
    private String image;

    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "pharmacien")
    private List<Pharmacie> pharmacie;

}
