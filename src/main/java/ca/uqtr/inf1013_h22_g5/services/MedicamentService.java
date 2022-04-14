package ca.uqtr.inf1013_h22_g5.services;

import ca.uqtr.inf1013_h22_g5.dto.ClientDTO;
import ca.uqtr.inf1013_h22_g5.dto.MedicamentDTO;
import ca.uqtr.inf1013_h22_g5.model.Client;
import ca.uqtr.inf1013_h22_g5.model.Medicament;

import java.util.List;
import java.util.Optional;

public interface MedicamentService {


    MedicamentDTO save(MedicamentDTO dto);

    Optional<MedicamentDTO> findById(Integer id);

    Optional<MedicamentDTO> findMedicamentByNom(String nom);

    Optional<MedicamentDTO> findMedicamentByMarque(String marque);

    Optional<MedicamentDTO> findMedicamentByPrix(double prix);

    List<MedicamentDTO> findAll();

    void delete(Integer id);

}
