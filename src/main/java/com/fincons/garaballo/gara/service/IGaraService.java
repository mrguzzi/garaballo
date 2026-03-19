package com.fincons.garaballo.gara.service;

import com.fincons.garaballo.gara.dto.GaraDto;
import com.fincons.garaballo.gara.entity.GaraEntity;

import java.util.List;

public interface IGaraService {

    GaraEntity creaGara(GaraDto garaDto);

    GaraEntity aggiornaGara(Integer id, GaraDto garaDto);

    GaraEntity getGara(Integer id);

    List<GaraEntity> findAll();

    void eliminaGara(Integer id);
}
