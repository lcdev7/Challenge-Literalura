package com.aluragrupo9.challengeLiterAluragrupo9.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class DatosAutor {

    @JsonAlias("name")
    private String nombre;

    @JsonAlias("birth_year")
    private Integer anoNacimiento;

    @JsonAlias("death_year")
    private Integer anoFallecimiento;

    public String getNombre() {
        return nombre;
    }

    public Integer getAnoNacimiento() {
        return anoNacimiento;
    }

    public Integer getAnoFallecimiento() {
        return anoFallecimiento;
    }
}