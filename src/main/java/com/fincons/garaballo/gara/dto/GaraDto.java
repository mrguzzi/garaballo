package com.fincons.garaballo.gara.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class GaraDto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Timestamp data;

    private Integer pistaId;

    private Integer categoriaId;

    private Integer idPartecipanteUno;

    private Integer idPartecipanteDue;

    private Integer giudiceId;

    public GaraDto(Integer id, Timestamp data, Integer pistaId, Integer categoriaId, Integer idPartecipanteUno, Integer idPartecipanteDue, Integer giudiceId) {
        this.id = id;
        this.data = data;
        this.pistaId = pistaId;
        this.categoriaId = categoriaId;
        this.idPartecipanteUno = idPartecipanteUno;
        this.idPartecipanteDue = idPartecipanteDue;
        this.giudiceId = giudiceId;
    }
}
