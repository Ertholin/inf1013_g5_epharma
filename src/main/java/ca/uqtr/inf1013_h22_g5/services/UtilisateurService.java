package ca.uqtr.inf1013_h22_g5.services;

import ca.uqtr.inf1013_h22_g5.dto.UtilisateurDTO;

import java.util.List;
import java.util.Optional;

public interface UtilisateurService {

    UtilisateurDTO save(UtilisateurDTO dto);

    Optional<UtilisateurDTO> findById(Integer id);

    Optional<UtilisateurDTO> findByEmail(String email);

    List<UtilisateurDTO> findAll();

    void delete(Integer id);

}
