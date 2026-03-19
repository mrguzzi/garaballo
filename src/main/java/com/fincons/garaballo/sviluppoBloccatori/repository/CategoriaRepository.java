package com.fincons.garaballo.sviluppoBloccatori.repository;

import com.fincons.garaballo.sviluppoBloccatori.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
