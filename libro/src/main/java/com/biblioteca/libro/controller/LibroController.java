package com.biblioteca.libro.controller;

import com.biblioteca.libro.entity.Libro;
import com.biblioteca.libro.service.LibroService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
@AllArgsConstructor
public class LibroController {

    private LibroService libroService;

    @PostMapping("/crear")
    public ResponseEntity<String> crearLibro(@RequestBody Libro libro) {
        libroService.crearLibro(libro);
        return ResponseEntity.ok("Libro creado correctamente");
    }

    @GetMapping("/obtenerTodo")
    public List<Libro> obtenerLibros() {
        return libroService.listarLibros();
    }
}
