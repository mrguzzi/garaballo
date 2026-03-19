package com.fincons.garaballo.piste.mapper;

import com.fincons.garaballo.piste.dto.PistaDto;
import com.fincons.garaballo.piste.entity.PistaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PistaMapper {
    PistaMapper INSTANCE = Mappers.getMapper(PistaMapper.class);

    List<PistaDto> toListPistaDto(List<PistaEntity> pistaEntity);

    List<PistaEntity> toListPistaEntity(List<PistaDto> pistaDto);

    PistaDto toPistaDto(PistaEntity pistaEntity);

    PistaEntity toPista(PistaDto pistaDto);
}
