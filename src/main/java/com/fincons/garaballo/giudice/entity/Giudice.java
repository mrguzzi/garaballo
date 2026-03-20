package com.fincons.garaballo.giudice.entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Giudice {

    private Integer id;
    private String nome;

}
