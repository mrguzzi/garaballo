package com.fincons.garaballo.gara.service;

import com.fincons.garaballo.gara.dto.PartecipanteDto;
import com.fincons.garaballo.gara.entity.PartecipanteEntity;
import com.fincons.garaballo.gara.mapper.IPartecipanteMapper;
import com.fincons.garaballo.gara.repository.IPartecipanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartecipanteService implements IPartecipanteService{
    private final IPartecipanteRepository partecipanteRepository;
    private final IPartecipanteMapper mapper;

    @Override
    public PartecipanteDto creaPartecipante(PartecipanteDto dto) {

        PartecipanteEntity entity = new PartecipanteEntity();

        entity.setNome(dto.getNome());
        entity.setCognome(dto.getCognome());
        entity.setDataDiNascita(dto.getDataDiNascita());
        entity.setExpLvl(dto.getExpLvl());

        //salvo l'entità
        PartecipanteEntity salvato = partecipanteRepository.save(entity);

        //riconverto da entity a mapper
        return mapper.toPartecipanteDto(salvato);
    }

    @Override
    public PartecipanteDto getPartecipanteById(Integer id) {
        PartecipanteEntity entity = partecipanteRepository.findById((id))
                .orElseThrow(() -> new RuntimeException("Partecipante non trovato"));

        return mapper.toPartecipanteDto(entity);
    }

    @Override
    public List<PartecipanteDto> getAllPartecipanti() {
        return partecipanteRepository.findAll()
                .stream()
                .map(mapper::toPartecipanteDto)
                .toList();
    }

    @Override
    public PartecipanteDto updatePartecipante(Integer id, PartecipanteDto dto) {
        PartecipanteEntity entity = partecipanteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Partecipante non trovato"));

        entity.setNome(dto.getNome());
        entity.setCognome(dto.getCognome());
        entity.setDataDiNascita(dto.getDataDiNascita());
        entity.setExpLvl(dto.getExpLvl());

        return mapper.toPartecipanteDto(entity);
    }

    @Override
    public void deletePartecipante(Integer id) {
        throw new UnsupportedOperationException("Operazione non fatta");
    }
}
