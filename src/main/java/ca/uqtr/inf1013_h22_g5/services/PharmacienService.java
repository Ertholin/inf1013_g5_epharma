package ca.uqtr.inf1013_h22_g5.services;

import ca.uqtr.inf1013_h22_g5.dto.PharmacienDTO;
import ca.uqtr.inf1013_h22_g5.model.Pharmacien;

import java.util.List;
import java.util.Optional;

public interface PharmacienService {

    PharmacienDTO save(Pharmacien pharmacien);

    Optional<Pharmacien> findById(Long id);

    List<Pharmacien> findAll();

    void delete(Long id);

}
