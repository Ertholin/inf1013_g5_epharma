package ca.uqtr.inf1013_h22_g5.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mvtstk", schema = "public")
public class MvtStk extends AbstractEntity{

    private Instant dateMvtStk;

    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "idmedicament")
    private Medicament medicament;

    private TypeMvtStk typeMvtStk;
}
