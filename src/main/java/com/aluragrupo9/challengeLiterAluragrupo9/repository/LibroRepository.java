package com.aluragrupo9.challengeLiterAluragrupo9.repository;

import com.aluragrupo9.challengeLiterAluragrupo9.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByIdioma(String idioma);

    boolean existsByTitulo(String titulo);

}