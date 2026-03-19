package com.fincons.garaballo.sviluppoBloccatori.service;

import com.fincons.garaballo.sviluppoBloccatori.domain.Categoria;

import java.util.List;

public interface ICategoriaService {
    List<Categoria> findAll();

    Categoria findById(Integer id);

    Categoria create(Categoria categoria);

    Categoria update(Integer id, Categoria updated);

    void delete(Integer id);
}
