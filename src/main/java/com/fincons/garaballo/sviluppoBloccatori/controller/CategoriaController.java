package com.fincons.garaballo.sviluppoBloccatori.controller;

import com.fincons.garaballo.sviluppoBloccatori.domain.Categoria;
import com.fincons.garaballo.sviluppoBloccatori.service.ICategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class CategoriaController implements com.fincons.garaballo.sviluppoBloccatori.api.CategoriaApi {

    private final ICategoriaService service;

    public CategoriaController(ICategoriaService service) {
        this.service = service;
    }

    @Override
    @GetMapping
    public List<Categoria> getAll() {
        return service.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Categoria getById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @Override
    @PostMapping
    public Categoria create(@RequestBody Categoria categoria) {
        return service.create(categoria);
    }

    @Override
    @PutMapping("/{id}")
    public Categoria update(@PathVariable Integer id, @RequestBody Categoria categoria) {
        return service.update(id, categoria);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}