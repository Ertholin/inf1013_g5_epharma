package ca.uqtr.inf1013_h22_g5.repository;

import ca.uqtr.inf1013_h22_g5.model.DemandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeClientRepository extends JpaRepository<DemandeClient, Integer> {
}
