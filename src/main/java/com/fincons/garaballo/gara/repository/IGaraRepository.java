package com.fincons.garaballo.gara.repository;

import com.fincons.garaballo.gara.entity.Gara;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IGaraRepository extends JpaRepository<Gara, Integer> {
    Gara save(Gara gara);

    List<Gara> findAll();

    void deleteById(Integer integer);
}
