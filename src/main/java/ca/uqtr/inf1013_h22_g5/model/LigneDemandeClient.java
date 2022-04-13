package ca.uqtr.inf1013_h22_g5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LigneDemandeClient extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idmedicament")
    private Medicament medicament;

    @ManyToOne
    @JoinColumn(name = "iddemandeClient")
    private DemandeClient demandeClient;
}
