package com.fincons.garaballo.piste.api;

import com.fincons.garaballo.piste.dto.PistaDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/default")
public interface PisteApi {

    @GetMapping("/{pistaId}")
    ResponseEntity<PistaDto> getPistaById(@PathVariable @Max(1000) @Min(0) Integer pistaId);

    @DeleteMapping("/{pistaId}")
    ResponseEntity<String> deletePista(@PathVariable @Max(1000) @Min(0) Integer pistaId);

    @PostMapping
    ResponseEntity<PistaDto> createPista(@Valid @RequestBody PistaDto pista);

    @PutMapping
    ResponseEntity<PistaDto> updatePista(@Valid @RequestBody PistaDto pista);

}
