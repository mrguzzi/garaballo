package com.fincons.garaballo.bonus.service;

import com.fincons.garaballo.bonus.dto.BonusDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BonusService {

    private final List<BonusDto> bonuses = new ArrayList<>();

    public List<BonusDto> getAllBonuses() {
        return bonuses;
    }

    public BonusDto getBonus(Integer idCoppia) {
        return bonuses.stream()
                .filter(b -> b.getIdCoppia().equals(idCoppia))
                .findFirst()
                .orElse(null);
    }

    public BonusDto addBonus(BonusDto bonus) {
        bonuses.add(bonus);
        return bonus;
    }

    public boolean deleteBonus(Integer idCoppia) {
        return bonuses.removeIf(b -> b.getIdCoppia().equals(idCoppia));
    }

    public double applyBonus(double price, BonusDto bonus) {
        return price - bonus.getValue();
    }

    public Integer getById(Integer idCoppia) {
        return idCoppia;
    }

    public List<BonusDto> getAll() {
        return null;
    }

    public BonusDto createBonus(BonusDto dto) {
        return null;
    }

    public BonusDto updateBonus(Integer id, BonusDto dto) {
    return null;
    }
}

