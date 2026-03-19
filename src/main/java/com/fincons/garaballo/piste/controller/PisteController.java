package com.fincons.garaballo.piste.controller;

import com.fincons.garaballo.piste.api.PisteApi;
import com.fincons.garaballo.piste.dto.PistaDto;
import com.fincons.garaballo.piste.service.PisteService;
import lombok.extern.slf4j.Slf4j;
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
        return null;
    }

    @Override
    public ResponseEntity<String> deletePista(Integer pistaId) {
        return null;
    }

    @Override
    public ResponseEntity<PistaDto> createPista(PistaDto pista) {
        return null;
    }

    @Override
    public ResponseEntity<PistaDto> updatePista(PistaDto pista) {
        return null;
    }
}
