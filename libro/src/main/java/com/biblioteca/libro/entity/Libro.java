package com.biblioteca.libro.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;
    private String isbn;
    private String titulo;
    private LocalDate anoPublicacion;
    private String descripcion;
    @ElementCollection
    @MapKeyColumn(name = "nombre_autor")
    @Column(name = "nacionalidad")
    private Map<String,String> autores;


}
