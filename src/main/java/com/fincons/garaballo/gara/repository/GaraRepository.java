package com.fincons.garaballo.gara.repository;

import com.fincons.garaballo.gara.entity.Gara;
import com.fincons.garaballo.gara.mapper.GaraMapper;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GaraRepository implements IGaraRepository {

    private final IGaraRepository garaRepository;

    public GaraRepository(IGaraRepository garaRepository) {
        this.garaRepository = garaRepository;
    }

    @Override
    @Transactional(rollbackOn = Exception.class, value = Transactional.TxType.REQUIRED)
    public Gara save(Gara gara) {
        return null;
    }

    @Override
    public List<Gara> findAll() {
        return garaRepository.findAll();
    }

    @Override
    public void deleteById(Integer integer) {
        garaRepository.deleteById(integer);
    }
}
