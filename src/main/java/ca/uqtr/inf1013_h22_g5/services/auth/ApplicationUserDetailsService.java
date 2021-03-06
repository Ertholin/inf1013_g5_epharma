package ca.uqtr.inf1013_h22_g5.services.auth;

import ca.uqtr.inf1013_h22_g5.dto.UtilisateurDTO;
import ca.uqtr.inf1013_h22_g5.exception.EntityNotFoundException;
import ca.uqtr.inf1013_h22_g5.exception.ErrorCodes;
import ca.uqtr.inf1013_h22_g5.model.Utilisateur;
import ca.uqtr.inf1013_h22_g5.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class ApplicationUserDetailsService implements UserDetailsService {

    @Autowired
    private UtilisateurRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Utilisateur utilisateur = repository.findUtilisateurByEmail(email).orElseThrow(()->
                new EntityNotFoundException("Aucun utilisateur avec l'email fourni", ErrorCodes.UTILISATEUR_NOT_FOUND)
        );

        return new User(utilisateur.getEmail(), utilisateur.getMotDepasse(), Collections.emptyList());

    }
}
