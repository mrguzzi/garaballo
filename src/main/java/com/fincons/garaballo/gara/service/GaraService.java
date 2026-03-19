package com.fincons.garaballo.gara.service;

import com.fincons.garaballo.gara.dto.GaraDto;
import com.fincons.garaballo.gara.entity.GaraEntity;
import com.fincons.garaballo.gara.repository.GaraRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GaraService implements IGaraService {

    private final GaraRepository repository;

    public GaraService(GaraRepository repository) {
        this.repository = repository;
    }

    @Override
    public GaraEntity creaGara(GaraDto garaDto) {
        return null;
    }

    @Override
    public GaraEntity aggiornaGara(Integer id, GaraDto garaDto) {
        return null;
    }

    @Override
    public GaraEntity getGara(Integer id) {
        return null;
    }

    @Override
    public List<GaraEntity> findAll() {
        return List.of();
    }

    @Override
    public void eliminaGara(Integer id) {

    }
}
