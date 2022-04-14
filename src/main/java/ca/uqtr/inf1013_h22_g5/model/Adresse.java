package ca.uqtr.inf1013_h22_g5.model;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse implements Serializable {

    private int numeroCivil;

    private String nomRue;

    private String nomVille;

    private String nomProvince;

    private String codePostale;

    private String pays;
}
