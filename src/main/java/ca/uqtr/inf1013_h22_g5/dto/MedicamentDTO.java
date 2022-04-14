package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Exemplaire;
import ca.uqtr.inf1013_h22_g5.model.LigneDemandeClient;
import ca.uqtr.inf1013_h22_g5.model.Medicament;
import ca.uqtr.inf1013_h22_g5.model.Pharmacie;
import liquibase.pro.packaged.M;
import lombok.Builder;
import lombok.Data;

import javax.persistence.ManyToOne;
import java.util.List;

@Data
@Builder
public class MedicamentDTO {

    private Integer id;
    private String nom;
    private String description;
    private String marque;
    private String format;
    private double prix;
    private String codeProduit;
    private String posologie;
    private String ingredient;
    private String avertissement;
    private String image;

    private Pharmacie pharmacie;
    private List<LigneDemandeClient> ligneDemandeClientList;
    private List<Exemplaire> exemplaires;

    public static MedicamentDTO fromEntity(Medicament medicament){
        if(medicament == null){
            return null;
        }
        return MedicamentDTO.builder()
                .id(medicament.getId())
                .nom(medicament.getNom())
                .description(medicament.getDescription())
                .marque(medicament.getMarque())
                .format(medicament.getFormat())
                .prix(medicament.getPrix())
                .codeProduit(medicament.getCodeProduit())
                .posologie(medicament.getPosologie())
                .ingredient(medicament.getIngredient())
                .avertissement(medicament.getAvertissement())
                .image(medicament.getImage())
                .build();
    }

    public static Medicament toEntity(MedicamentDTO medicamentDTO){
        if(medicamentDTO == null){
            return null;
        }

        Medicament medicament = new Medicament();
        medicament.setId(medicamentDTO.getId());
        medicament.setNom(medicamentDTO.getNom());
        medicament.setDescription(medicamentDTO.getDescription());
        medicament.setMarque(medicamentDTO.getMarque());
        medicament.setFormat(medicamentDTO.getFormat());
        medicament.setPrix(medicamentDTO.getPrix());
        medicament.setCodeProduit(medicamentDTO.getCodeProduit());
        medicament.setPosologie(medicamentDTO.getPosologie());
        medicament.setIngredient(medicamentDTO.getIngredient());
        medicament.setAvertissement(medicamentDTO.getAvertissement());
        medicament.setImage(medicamentDTO.getImage());

        return medicament;
    }

}
