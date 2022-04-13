package ca.uqtr.inf1013_h22_g5.repository;

import ca.uqtr.inf1013_h22_g5.model.LigneDemandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneDemandeClientRepository extends JpaRepository<LigneDemandeClient, Integer> {
}
