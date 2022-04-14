package ca.uqtr.inf1013_h22_g5.services;

import ca.uqtr.inf1013_h22_g5.dto.ClientDTO;
import ca.uqtr.inf1013_h22_g5.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    ClientDTO save(ClientDTO dto);

    Optional<ClientDTO> findById(Integer id);

    Optional<ClientDTO> findClientByEmail(String email);

    List<ClientDTO> findAll();

    void delete(Integer id);
}
