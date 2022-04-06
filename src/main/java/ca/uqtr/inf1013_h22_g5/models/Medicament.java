package ca.uqtr.inf1013_h22_g5.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Medicament {

    @Id
    private Long ID;
    private String nom;
    private String description;
    private String marque;
    private String format;
    private double prix;
    private String codeproduit;
    private String posologie;
    private String ingredient;
    private String avertissement;
    private String image;

}
