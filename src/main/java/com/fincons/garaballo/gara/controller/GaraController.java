package com.fincons.garaballo.gara.controller;

import com.fincons.garaballo.gara.api.GaraApi;
import com.fincons.garaballo.gara.dto.GaraDto;
import com.fincons.garaballo.gara.entity.GaraEntity;
import com.fincons.garaballo.gara.mapper.GaraMapper;
import com.fincons.garaballo.gara.service.IGaraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GaraController implements GaraApi {

    private final IGaraService service;
    private final GaraMapper mapper;

    public GaraController(IGaraService service, GaraMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    public ResponseEntity<GaraDto> getGaraById(@PathVariable Integer garaId) {
        return ResponseEntity.ok(
                mapper.toGaraDto(service.getGara(garaId))
        );
    }

    @Override
    public ResponseEntity<GaraDto> creaGara(@RequestBody GaraDto dto) {
        GaraEntity saved = service.creaGara(dto);
        return ResponseEntity.ok(mapper.toGaraDto(saved));
    }

    @Override
    public ResponseEntity<GaraDto> aggiornaGara(@PathVariable Integer garaId,
                                                @RequestBody GaraDto dto) {
        return ResponseEntity.ok(
                mapper.toGaraDto(service.aggiornaGara(garaId, dto))
        );
    }

    @Override
    public ResponseEntity<List<GaraDto>> getAll() {
        return ResponseEntity.ok(
                mapper.toGaraDtoList(service.findAll())
        );
    }

    @Override
    public ResponseEntity<Void> elimina(@PathVariable Integer garaId) {
        service.eliminaGara(garaId);
        return ResponseEntity.noContent().build();
    }
}
