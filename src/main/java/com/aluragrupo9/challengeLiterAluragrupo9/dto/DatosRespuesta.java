package com.aluragrupo9.challengeLiterAluragrupo9.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;

public class DatosRespuesta {

    @JsonAlias("results")
    private List<DatosLibro> resultados;

    public List<DatosLibro> getResultados() {
        return resultados;
    }
}