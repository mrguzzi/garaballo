package com.fincons.garaballo.sviluppoBloccatori.controller;

import com.fincons.garaballo.sviluppoBloccatori.domain.LivelloEsperienza;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livelli")
public class LivelloController implements com.fincons.garaballo.sviluppoBloccatori.api.LivelloApi {

    @Override
    @GetMapping
    public LivelloEsperienza[] getAll() {
        return LivelloEsperienza.values();
    }
}