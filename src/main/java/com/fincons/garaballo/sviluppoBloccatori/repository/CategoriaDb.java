package com.fincons.garaballo.sviluppoBloccatori.repository;

import com.fincons.garaballo.sviluppoBloccatori.domain.Categoria;
import com.fincons.garaballo.sviluppoBloccatori.domain.db.CategoriaDto;
import com.fincons.garaballo.sviluppoBloccatori.mapper.CategoriaMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;

@Slf4j
public class CategoriaDb implements CategoriaRepository {

    private final CategoriaDbRepository categoriaDbRepository;

    @PersistenceContext
    EntityManager entityManager;

    public CategoriaDb(CategoriaDbRepository categoriaDbRepository) {
        this.categoriaDbRepository = categoriaDbRepository;
    }

    @Override
    public List<Categoria> getAllCategorie() {
        return CategoriaMapper.INSTANCE.toCategoriaList(categoriaDbRepository.findAll());
    }

    @Override
    public Categoria findCategoriaById(Integer id) {
        Optional<Categoria> categoriaOptional = categoriaDbRepository.findById(id);
        return CategoriaMapper.INSTANCE.toCategoriaEntity(categoriaOptional);
    }

    @Override
    public Categoria createCategoria(Categoria categoria) {
        return null;
    }

    @Override
    public void deleteCategoriaById(Integer id) {
        categoriaDbRepository.deleteById(id);
    }
}
