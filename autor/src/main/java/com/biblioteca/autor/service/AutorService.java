package com.biblioteca.autor.service;

import com.biblioteca.autor.entity.Autor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutorService {

    void save(Autor autor);

    List<Autor> findByNombreLibro(String nombreLibro);

    List<Autor> findAll();

}
