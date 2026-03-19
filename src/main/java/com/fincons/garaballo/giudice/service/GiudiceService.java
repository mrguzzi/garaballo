package com.fincons.garaballo.giudice.service;

import com.fincons.garaballo.giudice.entity.Giudice;
import com.fincons.garaballo.giudice.repository.GiudiceRepository;
import com.fincons.garaballo.giudice.service.IGiudiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiudiceService implements IGiudiceService {

    private final GiudiceRepository repo;

    public GiudiceService(GiudiceRepository repo) {
        this.repo = repo;
    }

    @Override
    public Giudice create(Giudice entity) {
        return repo.save(entity);
    }

    @Override
    public Giudice getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Giudice> getAll() {
        return repo.findAll();
    }

    @Override
    public Giudice update(Integer id, Giudice entity) {
        return repo.findById(id).map(existing -> {
            existing.setNome(entity.getNome());
            return repo.save(existing);
        }).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}