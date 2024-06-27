package com.biblioteca.autor.controller;

import com.biblioteca.autor.entity.Autor;
import com.biblioteca.autor.service.AutorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
@AllArgsConstructor
public class AutorController {

    private AutorService autorService;

    @PostMapping("/crear")
    public ResponseEntity<String> crearAutor(@RequestBody Autor autor) {
        autorService.save(autor);
        return ResponseEntity.ok("Autor creado correctamente");
    }


    @GetMapping("/obtenerPorNombreLibro/{nombreLibro}")
    public List<Autor> obtenerAutorPorNombreLibro(@PathVariable String nombreLibro) {
        return autorService.findByNombreLibro(nombreLibro);
    }

    @GetMapping("/obtenerTodo")
    public List<Autor> obtenerAutor() {
        return autorService.findAll();
    }

}
