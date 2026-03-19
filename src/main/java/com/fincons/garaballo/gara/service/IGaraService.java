package com.fincons.garaballo.gara.service;

import com.fincons.garaballo.gara.dto.GaraDto;
import com.fincons.garaballo.gara.entity.Gara;

import java.util.List;

public interface IGaraService {

    Gara creaGara(GaraDto garaDto);

    Gara aggiornaGara(Integer id, GaraDto garaDto);

    Gara getGara(Integer id);

    List<Gara> findAll();

    void eliminaGara(Integer id);
}
