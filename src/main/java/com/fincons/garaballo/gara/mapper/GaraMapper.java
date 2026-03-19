package com.fincons.garaballo.gara.mapper;

import com.fincons.garaballo.gara.dto.GaraDto;
import com.fincons.garaballo.gara.entity.Gara;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GaraMapper {

    GaraMapper INSTANCE = Mappers.getMapper(GaraMapper.class);

    Gara toGara(GaraDto garaDto);

    GaraDto toGaraDto(Gara gara);

    List<Gara> toGaraList(List<GaraDto> garaDtoList);

    List<GaraDto> toGaraDtoList(List<Gara> garaList);
}

