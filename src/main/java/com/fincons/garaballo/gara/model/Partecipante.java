package com.fincons.garaballo.gara.model;

import lombok.*;
import java.text.DateFormat;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class Partecipante {

    private final Integer id;
    private final String name;
    private final String surname;
    private final DateFormat dateOfBirth;
    private final ExperienceLevel expLvl;

}