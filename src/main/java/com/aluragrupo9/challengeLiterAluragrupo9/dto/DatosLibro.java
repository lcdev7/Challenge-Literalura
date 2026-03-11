package com.aluragrupo9.challengeLiterAluragrupo9.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;

public class DatosLibro {

    @JsonAlias("title")
    private String titulo;

    @JsonAlias("languages")
    private List<String> idiomas;

    @JsonAlias("download_count")
    private Integer numeroDescargas;

    @JsonAlias("authors")
    private List<DatosAutor> autores;

    public String getTitulo() {
        return titulo;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public Integer getNumeroDescargas() {
        return numeroDescargas;
    }

    public List<DatosAutor> getAutores() {
        return autores;
    }
}