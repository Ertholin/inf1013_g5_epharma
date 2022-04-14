package ca.uqtr.inf1013_h22_g5.services;

import ca.uqtr.inf1013_h22_g5.dto.PharmacienDTO;
import ca.uqtr.inf1013_h22_g5.model.Pharmacien;

import java.util.List;
import java.util.Optional;

public interface PharmacienService {

    PharmacienDTO save(PharmacienDTO dto);

    Optional<PharmacienDTO> findById(Integer id);

    List<PharmacienDTO> findAll();

    void delete(Long id);

}
