package com.fincons.garaballo.gara.entity;

import com.fincons.garaballo.gara.enums.LivelloEsperienzaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.security.Timestamp;
import java.text.DateFormat;

@Entity
@Table(name = "PARTECIPANTE")
@Getter
@Setter
public class PartecipanteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name = "nome")
    private  String nome;

    @Column(name = "cognome")
    private  String cognome;

    @Column(name = "dataDiNascita")
    private  DateFormat dataDiNascita;

    @Column(name = "livelloEsperienza")
    private LivelloEsperienzaEnum expLvl;

    @Version
    @Column(name = "version")
    private Long version;

    @CreationTimestamp
    @Column(name = "createdDate")
    private Timestamp createdDate;

    @UpdateTimestamp
    @Column(name = "lastModified")
    private Timestamp lastModified;


}
