package com.fincons.garaballo.categorie.controller;

import com.fincons.garaballo.categorie.domain.Categoria;
import com.fincons.garaballo.categorie.service.ICategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class CategoriaController implements com.fincons.garaballo.categorie.api.CategoriaApi {

    private final ICategoriaService categoriaService;

    public CategoriaController(ICategoriaService service) {
        this.categoriaService = service;
    }

    @Override
    @GetMapping
    public List<Categoria> getAllCategorie() {
        return categoriaService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Categoria getById(@PathVariable Integer id) {
        return categoriaService.findById(id);
    }

    @Override
    @PostMapping
    public Categoria create(@RequestBody Categoria categoria) {
        return categoriaService.create(categoria);
    }

    @Override
    @PutMapping("/{id}")
    public Categoria update(@PathVariable Integer id, @RequestBody Categoria categoria) {
        return categoriaService.update(id, categoria);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        categoriaService.delete(id);
    }
}