package com.fincons.garaballo.bonus.service;

import com.fincons.garaballo.bonus.dto.BonusDto;
import java.util.List;

    public interface IBonusService {

        BonusDto getById(Integer idCoppia);

        List<BonusDto> getAll();

        BonusDto createBonus(BonusDto bonusDto);

        BonusDto updateBonus(Integer idCoppia, BonusDto bonusDto);

        void deleteBonus(Integer idCoppia);


}
