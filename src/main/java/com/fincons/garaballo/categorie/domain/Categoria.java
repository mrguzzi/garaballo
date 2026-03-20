package com.fincons.garaballo.categorie.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    private Integer id;

    private String nome;

    private String descrizione;

}