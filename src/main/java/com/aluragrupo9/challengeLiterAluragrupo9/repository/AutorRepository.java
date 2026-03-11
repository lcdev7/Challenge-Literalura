package com.aluragrupo9.challengeLiterAluragrupo9.repository;

import com.aluragrupo9.challengeLiterAluragrupo9.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {

    List<Autor> findByAnoNacimientoLessThanEqualAndAnoFallecimientoGreaterThanEqual(int ano);

}