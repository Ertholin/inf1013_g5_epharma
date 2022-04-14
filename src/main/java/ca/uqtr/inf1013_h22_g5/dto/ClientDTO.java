package ca.uqtr.inf1013_h22_g5.dto;

import ca.uqtr.inf1013_h22_g5.model.Adresse;
import ca.uqtr.inf1013_h22_g5.model.Client;
import ca.uqtr.inf1013_h22_g5.model.DemandeClient;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class ClientDTO {

    private Integer id;

    private String nom;
    private String prenom;
    private String email;
    private Date dateNaissance;
    private String genre;
    private String image;

    private Adresse adresse;
    private List<DemandeClient> demandeClients;

    public static ClientDTO fromEntity(Client client){

        if(client == null){
            return null;
        }

        return ClientDTO.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .email(client.getEmail())
                .dateNaissance(client.getDateNaissance())
                .genre(client.getGenre())
                .image(client.getImage())

                .build();
    }

    public static Client toEntity(ClientDTO clientDTO){
        if(clientDTO == null){
            return null;
        }
        Client client = new Client();
        client.setId(clientDTO.getId());
        client.setNom(clientDTO.getNom());
        client.setPrenom(clientDTO.getPrenom());
        client.setEmail(clientDTO.getEmail());
        client.setDateNaissance(clientDTO.getDateNaissance());
        client.setGenre(clientDTO.getGenre());
        client.setImage(clientDTO.getImage());

        return client;
    }


}
