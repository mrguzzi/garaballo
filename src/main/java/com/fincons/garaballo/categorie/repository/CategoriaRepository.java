package com.fincons.garaballo.categorie.repository;

import com.fincons.garaballo.categorie.domain.Categoria;

import java.util.List;

public interface CategoriaRepository {

    List<Categoria> getAllCategorie();

    Categoria findCategoriaById(Integer id);

    Categoria createCategoria(Categoria categoria);

    void deleteCategoriaById(Integer id);

}
