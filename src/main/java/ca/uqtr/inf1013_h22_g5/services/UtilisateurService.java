package ca.uqtr.inf1013_h22_g5.services;

import ca.uqtr.inf1013_h22_g5.dto.UtilisateurDTO;
import ca.uqtr.inf1013_h22_g5.model.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurService {

    UtilisateurDTO save(UtilisateurDTO dto);

    Optional<UtilisateurDTO> findById(Integer id);

//    Optional<Utilisateur> findUtilisateurByEmail(String email);

    UtilisateurDTO findByEmail(String email);

    List<UtilisateurDTO> findAll();

    void delete(Integer id);

}
