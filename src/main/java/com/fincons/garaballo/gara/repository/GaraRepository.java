package com.fincons.garaballo.gara.repository;

import com.fincons.garaballo.gara.entity.GaraEntity;
import jakarta.transaction.Transactional;

import java.util.List;

public class GaraRepository implements GaraDbRepository {

    private final IGaraRepository garaRepository;

    public GaraRepository(IGaraRepository garaRepository) {
        this.garaRepository = garaRepository;
    }

    @Override
    @Transactional(rollbackOn = Exception.class, value = Transactional.TxType.REQUIRED)
    public GaraEntity save(GaraEntity garaEntity) {
        return null;
    }

    @Override
    public List<GaraEntity> findAll() {
        return garaRepository.findAll();
    }

    @Override
    public void deleteById(Integer integer) {
        garaRepository.deleteById(integer);
    }
}
