package com.fincons.garaballo.gara.mapper;

import com.fincons.garaballo.gara.dto.GaraDto;
import com.fincons.garaballo.gara.entity.GaraEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GaraMapper {

    GaraMapper INSTANCE = Mappers.getMapper(GaraMapper.class);

    GaraEntity toGara(GaraDto garaDto);

    GaraDto toGaraDto(GaraEntity garaEntity);

    List<GaraEntity> toGaraList(List<GaraDto> garaDtoList);

    List<GaraDto> toGaraDtoList(List<GaraEntity> garaEntityList);
}

