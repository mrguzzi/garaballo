package com.fincons.garaballo.sviluppoBloccatori.api;

import com.fincons.garaballo.sviluppoBloccatori.domain.Categoria;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CategoriaApi {
    @GetMapping
    List<Categoria> getAllCategorie();

    @GetMapping("/{id}")
    Categoria getById(@PathVariable Integer id);

    @PostMapping
    Categoria create(@RequestBody Categoria categoria);

    @PutMapping("/{id}")
    Categoria update(@PathVariable Integer id, @RequestBody Categoria categoria);

    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id);
}
