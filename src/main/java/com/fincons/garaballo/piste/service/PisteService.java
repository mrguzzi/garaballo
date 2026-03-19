package com.fincons.garaballo.piste.service;

import com.fincons.garaballo.piste.dto.PistaDto;

import java.util.List;

public class PisteService implements IPisteService{

    @Override
    public PistaDto getPistaById(int pistaId) {
        return null;
    }

    @Override
    public List<PistaDto> getAllPiste() {
        return List.of();
    }

    @Override
    public PistaDto saveNewPista(PistaDto pistaDto) {
        return null;
    }

    @Override
    public PistaDto updatePista(int pistaId, String pistaName) {
        return null;
    }

    @Override
    public void deletePistaById(int pistaId) {

    }
}
