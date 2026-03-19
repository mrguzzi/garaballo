package com.fincons.garaballo.giudice.api;

import com.fincons.garaballo.gara.entity.Gara;
import com.fincons.garaballo.giudice.entity.Giudice;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/default")
public interface GiudiceApi {

    @GetMapping()
    ResponseEntity<List<Giudice>> getAllGiudici();

    @PostMapping("/vote")
    ResponseEntity<Giudice> setVoting(@RequestParam @Min(0) @Max(5) Float voto, String persona);


}
