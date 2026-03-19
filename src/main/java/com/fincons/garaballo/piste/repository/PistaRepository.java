package com.fincons.garaballo.piste.repository;

import com.fincons.garaballo.piste.dto.PistaDto;
import com.fincons.garaballo.piste.entity.PistaEntity;
import com.fincons.garaballo.piste.mapper.PistaMapper;

import java.util.List;
import java.util.Optional;

public class PistaRepository implements IPistaRepository{

    private final PistaDbRepository pistaDbRepository;

    public PistaRepository(PistaDbRepository pistaDbRepository) {
        this.pistaDbRepository = pistaDbRepository;

    }

    @Override
    public PistaDto findById(Integer id) {
        Optional<PistaEntity> pistaEntity=pistaDbRepository.findById(id);
        return pistaEntity.map(PistaMapper.INSTANCE::toPistaDto).orElse(null);
    }

    @Override
    public List<PistaDto> findAll() {

        return PistaMapper.INSTANCE.toListPistaDto(pistaDbRepository.findAll());
    }

    @Override
    public void deleteById(Integer id) {
        pistaDbRepository.deleteById(id);
    }

    @Override
    public PistaDto save(PistaDto customer) {
        return null;
    }
}
