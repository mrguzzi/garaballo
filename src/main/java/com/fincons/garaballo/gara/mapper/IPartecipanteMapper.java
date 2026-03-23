package com.fincons.garaballo.gara.mapper;

import com.fincons.garaballo.gara.dto.PartecipanteDto;
import com.fincons.garaballo.gara.entity.PartecipanteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IPartecipanteMapper {

    PartecipanteDto toPartecipanteDto (PartecipanteEntity partecipante);
    PartecipanteEntity toPartecipante(PartecipanteDto partecipanteDto);
}
