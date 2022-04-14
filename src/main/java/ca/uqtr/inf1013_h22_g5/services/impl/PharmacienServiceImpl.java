package ca.uqtr.inf1013_h22_g5.services.impl;

import ca.uqtr.inf1013_h22_g5.dto.PharmacienDTO;
import ca.uqtr.inf1013_h22_g5.model.Pharmacien;
import ca.uqtr.inf1013_h22_g5.repository.PharmacienRepository;
import ca.uqtr.inf1013_h22_g5.services.PharmacienService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PharmacienServiceImpl implements PharmacienService {

    @Autowired
    private PharmacienRepository pharmacienRepository;

    @Override
    public PharmacienDTO save(PharmacienDTO dto) {
        return PharmacienDTO.fromEntity(
                pharmacienRepository.save(
                        PharmacienDTO.toEntity(dto))
        );
    }

    @Override
    public Optional<PharmacienDTO> findById(Integer id) {
        return pharmacienRepository.findById(id)
                .map(PharmacienDTO::fromEntity);
    }

    @Override
    public List<PharmacienDTO> findAll() {
        return pharmacienRepository.findAll()
                .stream()
                .map(PharmacienDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        if(id == null){
            log.error("Pharmacien ID is null");
        }
    }
}
