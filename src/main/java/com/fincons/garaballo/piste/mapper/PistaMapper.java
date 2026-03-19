package com.fincons.garaballo.piste.mapper;

import com.fincons.garaballo.piste.dto.PistaDto;
import com.fincons.garaballo.piste.entity.PistaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PistaMapper {
    PistaMapper INSTANCE = Mappers.getMapper(PistaMapper.class);

    PistaDto toPistaDto(PistaEntity pistaEntity);

    PistaEntity toPista(PistaDto pistaDto);
}
