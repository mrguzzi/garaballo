package com.fincons.garaballo.piste.repository;

import com.fincons.garaballo.piste.dto.PistaDto;

import java.util.List;

public interface IPistaRepository {
    PistaDto findById(Integer id);

    List<PistaDto> findAll();

    void deleteById(Integer id);

    PistaDto save(PistaDto customer);
}
