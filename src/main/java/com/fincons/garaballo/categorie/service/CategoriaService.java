package com.fincons.garaballo.categorie.service;

import com.fincons.garaballo.categorie.domain.Categoria;
import com.fincons.garaballo.categorie.repository.CategoriaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CategoriaService implements ICategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.getAllCategorie();
    }

    @Override
    public Categoria findById(Integer id) {
        return categoriaRepository.findCategoriaById(id);
    }

    @Override
    public Categoria create(Categoria categoria) {
        return categoriaRepository.createCategoria(categoria);
    }

    @Override
    public Categoria update(Integer id, Categoria updated) {
        Categoria categoria = findById(id);
        categoria.setNome(updated.getNome());
        categoria.setDescrizione(updated.getDescrizione());
        return categoriaRepository.createCategoria(categoria);
    }

    @Override
    public void delete(Integer id) {
        categoriaRepository.deleteCategoriaById(id);
    }
}
