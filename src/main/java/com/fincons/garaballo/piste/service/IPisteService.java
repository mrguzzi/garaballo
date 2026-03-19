package com.fincons.garaballo.piste.service;

import com.fincons.garaballo.piste.dto.PistaDto;

import java.util.List;

public interface IPisteService {
    PistaDto getPistaById(int pistaId);

    List<PistaDto> getAllPiste();

    PistaDto saveNewPista(PistaDto pistaDto);

    PistaDto updatePista(int pistaId, String pistaName);

    void deletePistaById(int pistaId);
}
