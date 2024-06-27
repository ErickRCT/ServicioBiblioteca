package com.biblioteca.autor.repository;

import com.biblioteca.autor.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    // Buscar autores por el nombre del libro
    @Query("SELECT a FROM Autor a JOIN a.libros l WHERE l = :nombreLibro")
    List<Autor> findByNombreLibro(@Param("nombreLibro") String nombreLibro);
}
