package com.fincons.garaballo.categorie.repository;

import com.fincons.garaballo.categorie.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDbRepository extends JpaRepository<Categoria, Integer> {

}
