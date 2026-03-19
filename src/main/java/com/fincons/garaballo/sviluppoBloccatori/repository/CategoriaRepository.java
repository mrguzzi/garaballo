package com.fincons.garaballo.sviluppoBloccatori.repository;

import com.fincons.garaballo.sviluppoBloccatori.domain.Categoria;

import java.util.List;

public interface CategoriaRepository {

    List<Categoria> getAllCategorie();

    Categoria findCategoriaById(Integer id);

    Categoria createCategoria(Categoria categoria);

    void deleteCategoriaById(Integer id);

}
