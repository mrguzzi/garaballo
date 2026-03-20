package com.fincons.garaballo.gara.dto;


import com.fincons.garaballo.gara.entity.Coppia;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
public class GaraDto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "data")
    private Timestamp data;
    @Column(name = "pistaId")
    private Integer pistaId;
    @Column(name = "categoriaId")
    private Integer categoriaId;
    @ElementCollection
    private List<Coppia> coppie;
    @Column(name = "giudice_id")
    private Integer giudiceId;

    public GaraDto(Integer id, Timestamp data, Integer pistaId, Integer categoriaId, List<Coppia> coppie, Integer giudiceId) {
        this.id = id;
        this.data = data;
        this.pistaId = pistaId;
        this.categoriaId = categoriaId;
        this.coppie = coppie;
        this.giudiceId = giudiceId;
    }
}
