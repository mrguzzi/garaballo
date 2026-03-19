package com.fincons.garaballo.gara.repository;

import com.fincons.garaballo.gara.entity.GaraEntity;

import java.util.List;

public interface GaraDbRepository {
    GaraEntity save(GaraEntity garaEntity);

    List<GaraEntity> findAll();

    void deleteById(Integer integer);
}
