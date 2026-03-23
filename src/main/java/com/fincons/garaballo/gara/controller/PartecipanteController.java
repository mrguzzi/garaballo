package com.fincons.garaballo.gara.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import com.fincons.garaballo.gara.dto.PartecipanteDto;
import com.fincons.garaballo.gara.service.IPartecipanteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partecipanti")
@RequiredArgsConstructor
@Slf4j
public class PartecipanteController {

    private final IPartecipanteService partecipanteService;

    @PostMapping
    public ResponseEntity<PartecipanteDto> creaPartecipante(
            @RequestBody PartecipanteDto request) {

        PartecipanteDto response = partecipanteService.creaPartecipante(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PartecipanteDto> getPartecipanteById(
            @PathVariable Integer id) {

        return ResponseEntity.ok(partecipanteService.getPartecipanteById(id));
    }

    @GetMapping
    public ResponseEntity<List<PartecipanteDto>> getAllPartecipanti() {

        return ResponseEntity.ok(partecipanteService.getAllPartecipanti());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PartecipanteDto> updatePartecipante(
            @PathVariable Integer id,
            @RequestBody PartecipanteDto request) {

        return ResponseEntity.ok(
                partecipanteService.updatePartecipante(id, request)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePartecipante(
            @PathVariable Integer id) {

        //ATTENZIONE: SERVIZIO NON ANCORA FATTO

        partecipanteService.deletePartecipante(id);

        return ResponseEntity.noContent().build();
    }
}
