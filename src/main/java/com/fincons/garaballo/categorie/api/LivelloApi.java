package com.fincons.garaballo.categorie.api;

import com.fincons.garaballo.categorie.domain.LivelloEsperienza;
import org.springframework.web.bind.annotation.GetMapping;

public interface LivelloApi {
    @GetMapping
    LivelloEsperienza[] getAll();
}
