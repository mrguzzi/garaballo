package com.fincons.garaballo.gara.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Coppia {
    private Integer partecipanteUno;
    private Integer partecipanteDue;
}

