package ca.uqtr.inf1013_h22_g5.repository;

import ca.uqtr.inf1013_h22_g5.dto.UtilisateurDTO;
import ca.uqtr.inf1013_h22_g5.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.stream.DoubleStream;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    Optional<UtilisateurDTO> findUtilisateurByEmail(String email);
}
