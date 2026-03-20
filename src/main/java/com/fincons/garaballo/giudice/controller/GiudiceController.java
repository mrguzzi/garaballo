package com.fincons.garaballo.giudice.controller;

import com.fincons.garaballo.giudice.api.GiudiceApi;
import com.fincons.garaballo.giudice.entity.Giudice;
import com.fincons.garaballo.giudice.service.GiudiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class GiudiceController implements GiudiceApi {

    private final GiudiceService giudiceService;

    public GiudiceController(GiudiceService giudiceService) {
        this.giudiceService = giudiceService;
    }

    @Override
    public ResponseEntity<List<Giudice>> getAllGiudici() {
        List<Giudice> judgeService = giudiceService.getAll();
        if(judgeService.isEmpty()){
            return null;
        }
        return new ResponseEntity<>(judgeService, HttpStatus.OK);
    }


}
