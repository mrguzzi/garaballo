package com.fincons.garaballo.giudice.mapper;

import com.fincons.garaballo.giudice.dto.GiudiceDto;
import com.fincons.garaballo.giudice.entity.Giudice;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GiudiceMapper {

    GiudiceMapper INSTANCE = Mappers.getMapper(GiudiceMapper.class);

    GiudiceDto toDto(Giudice entity);

    Giudice toEntity(GiudiceDto dto);
}