package ca.uqtr.inf1013_h22_g5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Exemplaire extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idpharmacie")
    private Pharmacie pharmacie;

    @ManyToOne
    @JoinColumn(name = "idmedicament")
    private Medicament medicament;
}
