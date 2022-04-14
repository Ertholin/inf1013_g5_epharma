package ca.uqtr.inf1013_h22_g5.services;

import ca.uqtr.inf1013_h22_g5.dto.MvtStkDTO;

import java.math.BigDecimal;
import java.util.List;

public interface MvtStkService {

    BigDecimal stockReelMedicament (Integer iMedicament);

    List<MvtStkDTO> mtvStkMedicament(Integer idMedicament);

    MvtStkDTO entreeStock(MvtStkDTO dto);

    MvtStkDTO sortieStock(MvtStkDTO dto);

    MvtStkDTO correctionStockPos(MvtStkDTO dto);

    MvtStkDTO correctionStockNeg(MvtStkDTO dto);

}
