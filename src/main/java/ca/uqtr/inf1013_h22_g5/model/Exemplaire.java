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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exemplaire", schema = "public")
public class Exemplaire extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "idpharmacie")
    private Pharmacie pharmacie;

    @ManyToOne
    @JoinColumn(name = "idmedicament")
    private Medicament medicament;
}
