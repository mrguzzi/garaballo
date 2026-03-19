package com.fincons.garaballo.giudice.service;

import com.fincons.garaballo.giudice.dto.GiudiceDto;
import com.fincons.garaballo.giudice.entity.Giudice;
import com.fincons.garaballo.giudice.mapper.GiudiceMapper;
import com.fincons.garaballo.giudice.repository.GiudiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GiudiceService implements IGiudiceService {

    private final GiudiceRepository repo;
    private final GiudiceMapper mapper;

    public GiudiceService(GiudiceRepository repo, GiudiceMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public GiudiceDto create(GiudiceDto dto) {
        Giudice entity = mapper.toEntity(dto);
        return mapper.toDto(repo.save(entity));
    }

    @Override
    public GiudiceDto getById(Integer id) {
        return repo.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

    @Override
    public List<GiudiceDto> getAll() {
        return repo.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public GiudiceDto update(Integer id, GiudiceDto dto) {
        return repo.findById(id).map(existing -> {
            existing.setNome(dto.getNome());
            return mapper.toDto(repo.save(existing));
        }).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}