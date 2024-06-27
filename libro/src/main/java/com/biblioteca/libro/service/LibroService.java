package com.biblioteca.libro.service;

import com.biblioteca.libro.entity.Libro;

import java.util.List;

public interface LibroService {

    void crearLibro(Libro libro);

    List<Libro> listarLibros();

}
