package ca.uqtr.inf1013_h22_g5.services;

import ca.uqtr.inf1013_h22_g5.dto.DemandeClientDTO;
import ca.uqtr.inf1013_h22_g5.model.DemandeClient;

import java.util.List;
import java.util.Optional;

public interface DemandeClientService {

    DemandeClientDTO save(DemandeClientDTO dto);

    Optional<DemandeClient> findById(Integer id);

    DemandeClientDTO findDemandeClientByNumero(Integer numero);

    DemandeClientDTO findDemandeClientByCode(String code);

    List<DemandeClientDTO> findAll();

    void delete(Integer id);
}
