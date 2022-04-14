package ca.uqtr.inf1013_h22_g5.services.impl;

import ca.uqtr.inf1013_h22_g5.dto.DemandeClientDTO;
import ca.uqtr.inf1013_h22_g5.model.DemandeClient;
import ca.uqtr.inf1013_h22_g5.repository.DemandeClientRepository;
import ca.uqtr.inf1013_h22_g5.services.DemandeClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class DemandeClientServiceImpl implements DemandeClientService {

    private DemandeClientRepository demandeClientRepository;

    @Autowired
    public DemandeClientServiceImpl(DemandeClientRepository demandeClientRepository) {
        this.demandeClientRepository = demandeClientRepository;
    }

    @Override
    public DemandeClientDTO save(DemandeClientDTO dto) {
        return DemandeClientDTO.fromEntity(
                demandeClientRepository.save(
                        DemandeClientDTO.toEntity(dto)
                )
        );
    }

    @Override
    public Optional<DemandeClient> findById(Integer id) {
        return demandeClientRepository.findById(id);
    }

    @Override
    public DemandeClientDTO findDemandeClientByNumero(Integer numero) {

        return demandeClientRepository.findDemandeClientByNumero(numero);
    }

    @Override
    public DemandeClientDTO findDemandeClientByCode(String code) {
        return demandeClientRepository.findDemandeClientByCode(code);
    }

    @Override
    public List<DemandeClientDTO> findAll() {
        return demandeClientRepository.findAll()
                .stream().map(DemandeClientDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if(id == null){
            log.error("DemandeClient ID is null");
        }
        demandeClientRepository.deleteById(id);
    }
}
