package ca.uqtr.inf1013_h22_g5.repository;

import ca.uqtr.inf1013_h22_g5.dto.ClientDTO;
import ca.uqtr.inf1013_h22_g5.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Optional<Client> findClientByEmail(String email);


}