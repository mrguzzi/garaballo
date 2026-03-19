package com.fincons.garaballo.gara.service;

import com.fincons.garaballo.gara.dto.GaraDto;
import com.fincons.garaballo.gara.entity.Gara;
import com.fincons.garaballo.gara.repository.IGaraRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GaraService implements IGaraService {

    private final IGaraRepository repository;

    public GaraService(IGaraRepository repository) {
        this.repository = repository;
    }

    @Override
    public Gara creaGara(GaraDto garaDto) {
        return null;
    }

    @Override
    public Gara aggiornaGara(Integer id, GaraDto garaDto) {
        return null;
    }

    @Override
    public Gara getGara(Integer id) {
        return null;
    }

    @Override
    public List<Gara> findAll() {
        return List.of();
    }

    @Override
    public void eliminaGara(Integer id) {

    }
}
