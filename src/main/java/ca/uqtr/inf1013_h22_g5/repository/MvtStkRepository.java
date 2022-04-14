package ca.uqtr.inf1013_h22_g5.repository;

import ca.uqtr.inf1013_h22_g5.model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface MvtStkRepository extends JpaRepository<MvtStk, Integer> {

    @Query("select sum(m.quantite) from  MvtStk m where m.medicament.id = :idMedicament")
    BigDecimal stockReelMedicament(@Param("idMedicament") Integer idMedicament);

    List<MvtStk> findAllByMedicament(Integer idMedicament);
}
