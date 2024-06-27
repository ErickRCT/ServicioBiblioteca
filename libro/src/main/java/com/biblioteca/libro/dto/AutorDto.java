package com.biblioteca.libro.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorDto {
    private Long idAutor;
    private String nombreCompleto;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private List<String> libros;
}
