package ca.uqtr.inf1013_h22_g5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles", schema = "public")
public class Roles extends AbstractEntity{

    private String rolename;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateurs;
}
