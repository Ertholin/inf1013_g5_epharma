package ca.uqtr.inf1013_h22_g5.services.impl;

import ca.uqtr.inf1013_h22_g5.dto.MvtStkDTO;
import ca.uqtr.inf1013_h22_g5.model.TypeMvtStk;
import ca.uqtr.inf1013_h22_g5.repository.MvtStkRepository;
import ca.uqtr.inf1013_h22_g5.services.MedicamentService;
import ca.uqtr.inf1013_h22_g5.services.MvtStkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MvtStkServiceImpl implements MvtStkService {

    private MvtStkRepository repository;
    private MedicamentService medicamentService;

    @Autowired
    public MvtStkServiceImpl(MvtStkRepository repository, MedicamentService medicamentService) {
        this.repository = repository;
        this.medicamentService = medicamentService;
    }

    @Override
    public BigDecimal stockReelMedicament(Integer idMedicament) {
        if(idMedicament == null){
            log.warn("ID article is NULL");
            return BigDecimal.valueOf(-1);
        }
        medicamentService.findById(idMedicament);
        return repository.stockReelMedicament(idMedicament);
    }

    @Override
    public List<MvtStkDTO> mtvStkMedicament(Integer idMedicament) {
        return repository.findAllByMedicament(idMedicament).stream()
                .map(MvtStkDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public MvtStkDTO entreeStock(MvtStkDTO dto) {
        return entreePositive(dto, TypeMvtStk.ENTREE);
    }

    @Override
    public MvtStkDTO sortieStock(MvtStkDTO dto) {
        return sortieNegative(dto, TypeMvtStk.SORTIE);
    }

    @Override
    public MvtStkDTO correctionStockPos(MvtStkDTO dto) {
        return entreePositive(dto, TypeMvtStk.CORRECTION_POS);
    }

    @Override
    public MvtStkDTO correctionStockNeg(MvtStkDTO dto) {
        return sortieNegative(dto, TypeMvtStk.CORRECTION_NEG);
    }

    private MvtStkDTO entreePositive(MvtStkDTO dto, TypeMvtStk typeMvtStk){

        dto.setQuantite(BigDecimal.valueOf(Math.abs(dto.getQuantite().doubleValue())));

        dto.setTypeMvtStk(typeMvtStk);
        return MvtStkDTO.fromEntity(
                repository.save(MvtStkDTO.toEntity(dto))
        );
    }

    private MvtStkDTO sortieNegative(MvtStkDTO dto, TypeMvtStk typeMvtStk){

        dto.setQuantite(BigDecimal.valueOf(Math.abs(dto.getQuantite().doubleValue()) * -1 ));

        dto.setTypeMvtStk(typeMvtStk);
        return MvtStkDTO.fromEntity(
                repository.save(MvtStkDTO.toEntity(dto))
        );
    }
}
