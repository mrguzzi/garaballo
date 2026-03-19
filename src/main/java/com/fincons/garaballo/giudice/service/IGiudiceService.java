package com.fincons.garaballo.giudice.service;

import com.fincons.garaballo.giudice.dto.GiudiceDto;
import java.util.List;

public interface IGiudiceService {

    GiudiceDto create(GiudiceDto dto);

    GiudiceDto getById(Integer id);

    List<GiudiceDto> getAll();

    GiudiceDto update(Integer id, GiudiceDto dto);

    void delete(Integer id);
}