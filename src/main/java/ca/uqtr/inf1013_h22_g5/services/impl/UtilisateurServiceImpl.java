package ca.uqtr.inf1013_h22_g5.services.impl;

import ca.uqtr.inf1013_h22_g5.dto.UtilisateurDTO;
import ca.uqtr.inf1013_h22_g5.exception.EntityNotFoundException;
import ca.uqtr.inf1013_h22_g5.exception.ErrorCodes;
import ca.uqtr.inf1013_h22_g5.model.Utilisateur;
import ca.uqtr.inf1013_h22_g5.repository.UtilisateurRepository;
import ca.uqtr.inf1013_h22_g5.services.UtilisateurService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UtilisateurServiceImpl implements UtilisateurService {

   private UtilisateurRepository utilisateurRepository;

    @Autowired
    public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public UtilisateurDTO save(UtilisateurDTO dto) {
        return UtilisateurDTO.fromEntity(
                utilisateurRepository.save(
                        UtilisateurDTO.toEntity(dto))
        );
    }

    @Override
    public Optional<UtilisateurDTO> findById(Integer id) {
        return utilisateurRepository.findById(id)
                .map(UtilisateurDTO::fromEntity);
    }

//    @Override
//    public Optional<Utilisateur> findUtilisateurByEmail(String email) {
//        return utilisateurRepository.findUtilisateurByEmail(email);
//    }

    @Override
    public UtilisateurDTO findByEmail(String email) {
        return utilisateurRepository.findUtilisateurByEmail(email)
                .map(UtilisateurDTO::fromEntity)
                .orElseThrow(()-> new EntityNotFoundException(
                        "Aucun utilisateur avec l'email " + email + " n'a ete trouve",
                        ErrorCodes.UTILISATEUR_NOT_FOUND
                ));
    }

    @Override
    public List<UtilisateurDTO> findAll() {
        return utilisateurRepository.findAll()
                .stream().map(UtilisateurDTO::fromEntity)
                .collect(Collectors.toList());
    }



    @Override
    public void delete(Integer id) {
        if(id == null){
            log.error("Utilisateur ID is null");
        }
        utilisateurRepository.deleteById(id);
    }
}
