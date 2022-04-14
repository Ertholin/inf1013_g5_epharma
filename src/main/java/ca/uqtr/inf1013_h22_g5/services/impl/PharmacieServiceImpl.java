package ca.uqtr.inf1013_h22_g5.services.impl;

import ca.uqtr.inf1013_h22_g5.dto.PharmacieDTO;
import ca.uqtr.inf1013_h22_g5.model.Pharmacie;
import ca.uqtr.inf1013_h22_g5.repository.PharmacieRepository;
import ca.uqtr.inf1013_h22_g5.services.PharmacieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PharmacieServiceImpl implements PharmacieService {

    private PharmacieRepository pharmacieRepository;

    @Autowired
    public PharmacieServiceImpl(PharmacieRepository pharmacieRepository) {
        this.pharmacieRepository = pharmacieRepository;
    }

    @Override
    public PharmacieDTO save(PharmacieDTO dto) {
        return PharmacieDTO.fromEntity(
                pharmacieRepository.save(
                        PharmacieDTO.toEntity(dto)
                )
        );
    }

    @Override
    public Optional<PharmacieDTO> findById(Integer id) {
        return pharmacieRepository.findById(id)
                .map(PharmacieDTO::fromEntity);
    }

    @Override
    public List<PharmacieDTO> findAll() {
        return pharmacieRepository.findAll()
                .stream()
                .map(PharmacieDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if(id == null){
            log.error("Pharmacie ID is null");
        }
        pharmacieRepository.deleteById(id);
    }
}
