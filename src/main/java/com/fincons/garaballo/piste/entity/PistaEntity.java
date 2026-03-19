package com.fincons.garaballo.piste.entity;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PistaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "luogo")
    private String luogo;
    @Column(name = "capienza")
    private Integer capienza;

    @Version
    @Column(name = "version")
    private Integer version;

}