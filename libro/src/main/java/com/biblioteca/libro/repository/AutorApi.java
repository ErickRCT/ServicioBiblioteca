package com.biblioteca.libro.repository;

import com.biblioteca.libro.dto.AutorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "autorApi",url = "http://localhost:8080/autor")
public interface AutorApi {

    @GetMapping("/obtenerPorNombreLibro/{nombreLibro}")
    List<AutorDto> obtenerAutorPorNombreLibro(@PathVariable("nombreLibro") String nombreLibro);
}
