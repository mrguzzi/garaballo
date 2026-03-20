package com.fincons.garaballo.gara.dto;


import com.fincons.garaballo.gara.enums.LivelloEsperienzaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PartecipanteDto {

    private final Integer id;
    private final String nome;
    private final String cognome;
    private final DateFormat dataDiNascita;
    private final LivelloEsperienzaEnum expLvl;



}
