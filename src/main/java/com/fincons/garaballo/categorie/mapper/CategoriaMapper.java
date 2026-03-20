package com.fincons.garaballo.categorie.mapper;

import com.fincons.garaballo.categorie.domain.Categoria;
import com.fincons.garaballo.categorie.domain.db.CategoriaDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper
public interface CategoriaMapper {

    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    List<Categoria> toCategoriaList(List<Categoria> beerDtoList);

    Categoria toCategoriaEntity(Optional<Categoria> categoriaDto);

    CategoriaDto toCategoriaDto(Categoria categoria);

}
