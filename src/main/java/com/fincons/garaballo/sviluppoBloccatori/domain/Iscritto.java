package com.fincons.garaballo.sviluppoBloccatori.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Iscritto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String cognome;

    @Enumerated(EnumType.STRING)
    private LivelloEsperienza livello;

    @ManyToOne
    private Categoria categoria;

}