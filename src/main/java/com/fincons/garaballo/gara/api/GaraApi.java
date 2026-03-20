package com.fincons.garaballo.gara.api;

import com.fincons.garaballo.gara.dto.GaraDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/default")
public interface GaraApi {

    @GetMapping("/{garaId}")
    ResponseEntity<GaraDto> getGaraById(@PathVariable Integer garaId);

    @PostMapping
    ResponseEntity<GaraDto> creaGara(@RequestBody GaraDto dto);

    @PutMapping("/{garaId}")
    ResponseEntity<GaraDto> aggiornaGara(@PathVariable Integer garaId, @RequestBody GaraDto dto);

    @GetMapping
    ResponseEntity<List<GaraDto>> getAll();

    @DeleteMapping("/{garaId}")
    ResponseEntity<Void> elimina(@PathVariable Integer garaId);
}

