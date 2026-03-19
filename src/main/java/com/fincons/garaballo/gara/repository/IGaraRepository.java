package com.fincons.garaballo.gara.repository;

import com.fincons.garaballo.gara.entity.GaraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGaraRepository extends JpaRepository<GaraEntity, Integer> {
    GaraEntity save(GaraEntity garaEntity);

    List<GaraEntity> findAll();

    void deleteById(Integer integer);
}
