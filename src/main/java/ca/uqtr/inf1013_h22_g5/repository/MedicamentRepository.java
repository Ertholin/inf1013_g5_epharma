package ca.uqtr.inf1013_h22_g5.repository;

import ca.uqtr.inf1013_h22_g5.model.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MedicamentRepository extends JpaRepository<Medicament, Integer> {

    Optional<Medicament> findMedicamentByNom(String nom);

    Optional<Medicament> findMedicamentByMarque(String marque);

    Optional<Medicament> findMedicamentByPrix(double prix);
}
