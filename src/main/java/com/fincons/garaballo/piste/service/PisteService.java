package com.fincons.garaballo.piste.service;

import com.fincons.garaballo.piste.dto.PistaDto;
import com.fincons.garaballo.piste.repository.IPistaRepository;

import java.util.List;

public class PisteService implements IPisteService{

    private final IPistaRepository pistaRepository;

    public PisteService(IPistaRepository pistaRepository) {
        this.pistaRepository = pistaRepository;
    }


    @Override
    public PistaDto getPistaById(int pistaId) {
        return pistaRepository.findById(pistaId);
    }
    @Override
    public List<PistaDto> getAllPiste() {
        return pistaRepository.findAll();
    }

    @Override
    public PistaDto saveNewPista(PistaDto pistaDto) {
        return pistaRepository.save(pistaDto);
    }

    @Override
    public PistaDto updatePista(int pistaId, String pistaName) {
        PistaDto pistaDto=pistaRepository.findById(pistaId);
        if(pistaDto== null){
            return null;
        }
        pistaDto.setNome(pistaName);
        return pistaRepository.save(pistaDto);
    }

    @Override
    public void deletePistaById(int pistaId) {
        pistaRepository.deleteById(pistaId);
    }
}
