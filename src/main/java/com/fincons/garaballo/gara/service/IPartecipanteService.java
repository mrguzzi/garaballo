package com.fincons.garaballo.gara.service;

import com.fincons.garaballo.gara.dto.PartecipanteDto;

import java.util.List;

public interface IPartecipanteService {

    PartecipanteDto creaPartecipante(PartecipanteDto dto);

    PartecipanteDto getPartecipanteById(Integer id);

    List<PartecipanteDto> getAllPartecipanti();

    PartecipanteDto updatePartecipante(Integer id, PartecipanteDto dto);

    void deletePartecipante(Integer id);

}
