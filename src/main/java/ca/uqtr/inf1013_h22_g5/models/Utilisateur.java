package ca.uqtr.inf1013_h22_g5.models;

import javax.management.relation.Role;
import java.util.List;

public class Utilisateur {

    private String nom;

    private String prenom;

    private String motDepasse;

    private String email;

    private List<Role> roles;

}
