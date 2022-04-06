package ca.uqtr.inf1013_h22_g5.services.impl;

import ca.uqtr.inf1013_h22_g5.models.Pharmacien;
import ca.uqtr.inf1013_h22_g5.repository.PharmacienRepository;
import ca.uqtr.inf1013_h22_g5.services.PharmacienService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class PharmacienServiceImpl implements PharmacienService {

    @Autowired
    private PharmacienRepository pharmacienRepository;

    @Override
    public Pharmacien save(Pharmacien pharmacien) {
        return pharmacienRepository.save(pharmacien);
    }

    @Override
    public Optional<Pharmacien> findById(Long id) {
        return pharmacienRepository.findById(id);
    }

    @Override
    public List<Pharmacien> findAll() {
        return pharmacienRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        pharmacienRepository.deleteById(id);
    }
}
