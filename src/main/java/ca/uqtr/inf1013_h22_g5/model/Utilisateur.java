package ca.uqtr.inf1013_h22_g5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.management.relation.Role;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Utilisateur extends AbstractEntity{

    private String nom;

    private String prenom;

    private String motDepasse;

    private String email;

    private String photo;

    private Instant dateNaissance;

    @Embedded
    private Adresse adresse;

    @OneToMany(mappedBy = "utilisateurs")
    private List<Roles> roles;

}
