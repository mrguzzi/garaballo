package com.fincons.garaballo.gara.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Table(name="GARA")
@Entity
public class Gara {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="data")
    private Timestamp data;
    @Column(name="pistaId")
    private Integer pistaId;
    @Column(name="categoriaId")
    private Integer categoriaId;
    @Column(name="idPartecipanteUno")
    private Integer idPartecipanteUno;
    @Column(name="idPartecipanteDue")
    private Integer idPartecipanteDue;
    @Column(name="giudice_id")
    private Integer giudiceId;

    public Gara(Integer id, Timestamp data, Integer pistaId, Integer categoriaId, Integer idPartecipanteUno, Integer idPartecipanteDue, Integer giudiceId) {
        this.id = id;
        this.data = data;
        this.pistaId = pistaId;
        this.categoriaId = categoriaId;
        this.idPartecipanteUno = idPartecipanteUno;
        this.idPartecipanteDue = idPartecipanteDue;
        this.giudiceId = giudiceId;
    }
}
