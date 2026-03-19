package com.fincons.garaballo.sviluppoBloccatori.api;

import com.fincons.garaballo.sviluppoBloccatori.domain.LivelloEsperienza;
import org.springframework.web.bind.annotation.GetMapping;

public interface LivelloApi {
    @GetMapping
    LivelloEsperienza[] getAll();
}
