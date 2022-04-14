package ca.uqtr.inf1013_h22_g5.services;

import ca.uqtr.inf1013_h22_g5.dto.PharmacieDTO;

import java.util.List;
import java.util.Optional;

public interface PharmacieService {

    PharmacieDTO save(PharmacieDTO dto);

    Optional<PharmacieDTO> findById(Integer id);

    List<PharmacieDTO> findAll();

    void delete(Integer id);


}
