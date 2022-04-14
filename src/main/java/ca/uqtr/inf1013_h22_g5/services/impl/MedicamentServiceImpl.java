package ca.uqtr.inf1013_h22_g5.services.impl;

import ca.uqtr.inf1013_h22_g5.dto.ClientDTO;
import ca.uqtr.inf1013_h22_g5.dto.MedicamentDTO;
import ca.uqtr.inf1013_h22_g5.model.Medicament;
import ca.uqtr.inf1013_h22_g5.repository.MedicamentRepository;
import ca.uqtr.inf1013_h22_g5.services.MedicamentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MedicamentServiceImpl implements MedicamentService {

    private MedicamentRepository medicamentRepository;

    @Autowired
    public MedicamentServiceImpl(MedicamentRepository medicamentRepository) {
        this.medicamentRepository = medicamentRepository;
    }

    @Override
    public MedicamentDTO save(MedicamentDTO dto) {
        return MedicamentDTO.fromEntity(
                medicamentRepository.save(
                        MedicamentDTO.toEntity(dto)
                )
        );
    }

    @Override
    public Optional<MedicamentDTO> findById(Integer id) {
        return medicamentRepository.findById(id)
                .map(MedicamentDTO::fromEntity);
    }

    @Override
    public Optional<MedicamentDTO> findMedicamentByNom(String nom) {
        return medicamentRepository.findMedicamentByNom(nom)
                .map(MedicamentDTO::fromEntity);
    }

    @Override
    public Optional<MedicamentDTO> findMedicamentByMarque(String marque) {
        return medicamentRepository.findMedicamentByMarque(marque)
                .map(MedicamentDTO::fromEntity);
    }

    @Override
    public Optional<MedicamentDTO> findMedicamentByPrix(double prix) {
        return medicamentRepository.findMedicamentByPrix(prix)
                .map(MedicamentDTO::fromEntity);
    }

    @Override
    public List<MedicamentDTO> findAll() {
        return medicamentRepository.findAll().stream()
                .map(MedicamentDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if(id == null){
            log.error("Medicament ID is null");
        }
        medicamentRepository.deleteById(id);
    }
}
