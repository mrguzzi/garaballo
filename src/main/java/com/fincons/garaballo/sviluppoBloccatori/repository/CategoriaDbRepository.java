package com.fincons.garaballo.sviluppoBloccatori.repository;

import com.fincons.garaballo.sviluppoBloccatori.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDbRepository extends JpaRepository<Categoria, Integer> {

}
