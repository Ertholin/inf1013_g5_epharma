package ca.uqtr.inf1013_h22_g5.services.impl;

import ca.uqtr.inf1013_h22_g5.dto.ClientDTO;
import ca.uqtr.inf1013_h22_g5.model.Client;
import ca.uqtr.inf1013_h22_g5.repository.ClientRepository;
import ca.uqtr.inf1013_h22_g5.services.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientDTO save(ClientDTO dto) {
        return ClientDTO.fromEntity(
                clientRepository.save(
                        ClientDTO.toEntity(dto)
                )
        );
    }

    @Override
    public Optional<ClientDTO> findById(Integer id) {
        if(id == null){
            log.error("Client ID is null");
        }
        return clientRepository.findById(id)
                .map(ClientDTO::fromEntity);
    }

    @Override
    public Optional<ClientDTO> findClientByEmail(String email) {
        return clientRepository.findClientByEmail(email)
                .map(ClientDTO::fromEntity);
    }

    @Override
    public List<ClientDTO> findAll() {
        return clientRepository.findAll().stream()
                .map(ClientDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if(id == null){
            log.error("Client ID est null");
        }
        clientRepository.deleteById(id);
    }
}
