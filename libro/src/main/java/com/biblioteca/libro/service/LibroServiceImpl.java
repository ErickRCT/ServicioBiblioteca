package com.biblioteca.libro.service;

import com.biblioteca.libro.dto.AutorDto;
import com.biblioteca.libro.entity.Libro;
import com.biblioteca.libro.repository.AutorApi;
import com.biblioteca.libro.repository.LibroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class LibroServiceImpl implements LibroService {

    private LibroRepository libroRepository;

    private AutorApi autorApi;


    @Override
    public void crearLibro(Libro libro) {
        //obtener autor de la API autor
        List<AutorDto> autores = autorApi.obtenerAutorPorNombreLibro(libro.getTitulo());
        Map<String,String> autorYnacionalidad = new HashMap<>();
        for (AutorDto autor : autores) {
            autorYnacionalidad.put(autor.getNombreCompleto(),autor.getNacionalidad());
        }
        libro.setAutores(autorYnacionalidad);
        libroRepository.save(libro);
    }

    @Override
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }
}
