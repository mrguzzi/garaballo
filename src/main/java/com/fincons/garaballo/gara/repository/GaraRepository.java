package com.fincons.garaballo.gara.repository;

import com.fincons.garaballo.gara.entity.Gara;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GaraRepository implements IGaraRepository{

    @Override
    public <S extends Gara> S save(S entity) {
        return null;
    }

    @Override
    public List<Gara> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Integer integer) {

    }
}
