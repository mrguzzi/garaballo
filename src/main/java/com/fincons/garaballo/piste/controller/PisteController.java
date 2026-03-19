package com.fincons.garaballo.piste.controller;

import com.fincons.garaballo.piste.api.PisteApi;
import com.fincons.garaballo.piste.dto.PistaDto;
import com.fincons.garaballo.piste.service.PisteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "api/v1/piste")
@Validated
public class PisteController implements PisteApi {

    private final PisteService pisteService;


    public PisteController(PisteService pisteService) {
        this.pisteService = pisteService;
    }

    @Override
    public ResponseEntity<PistaDto> getPistaById(Integer pistaId) {
        PistaDto pistaDto=pisteService.getPistaById(pistaId);
        return new ResponseEntity<>(pistaDto, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deletePista(Integer pistaId) {
        pisteService.deletePistaById(pistaId);
        return new ResponseEntity<>("Pista with id "+ pistaId+ "deleted", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PistaDto> createPista(PistaDto pista) {
        PistaDto pistaDto=pisteService.saveNewPista(pista);
        return new ResponseEntity<>(pista, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PistaDto> updatePista(Integer pistaId, String name) {
        PistaDto pistaDto=pisteService.updatePista(pistaId,name);
        return null;
    }
}
