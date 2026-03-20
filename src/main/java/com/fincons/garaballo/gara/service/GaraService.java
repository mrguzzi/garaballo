package com.fincons.garaballo.gara.service;

import com.fincons.garaballo.gara.dto.GaraDto;
import com.fincons.garaballo.gara.entity.GaraEntity;
import com.fincons.garaballo.gara.mapper.GaraMapper;
import com.fincons.garaballo.gara.repository.IGaraRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GaraService implements IGaraService {

    private final IGaraRepository repository;
    private final GaraMapper mapper;

    public GaraService(IGaraRepository repository, GaraMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public GaraEntity creaGara(GaraDto garaDto) {
        GaraEntity entity = mapper.toGara(garaDto);
        return repository.save(entity);
    }

    @Override
    public GaraEntity aggiornaGara(Integer id, GaraDto garaDto) {
        GaraEntity existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Gara non trovata"));

        GaraEntity updated = mapper.toGara(garaDto);
        updated.setId(id);

        return repository.save(updated);
    }

    @Override
    public GaraEntity getGara(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Gara non trovata"));
    }

    @Override
    public List<GaraEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public void eliminaGara(Integer id) {
        repository.deleteById(id);
    }
}