package com.fincons.garaballo.sviluppoBloccatori.service;

import com.fincons.garaballo.sviluppoBloccatori.domain.Categoria;
import com.fincons.garaballo.sviluppoBloccatori.repository.CategoriaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CategoriaService implements ICategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Categoria> findAll() {
        return repository.findAll();
    }

    @Override
    public Categoria findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria non trovata"));
    }

    @Override
    public Categoria create(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public Categoria update(Integer id, Categoria updated) {
        Categoria categoria = findById(id);
        categoria.setNome(updated.getNome());
        categoria.setDescrizione(updated.getDescrizione());
        return repository.save(categoria);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
