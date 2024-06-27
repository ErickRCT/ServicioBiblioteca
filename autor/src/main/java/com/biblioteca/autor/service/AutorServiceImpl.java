package com.biblioteca.autor.service;

import com.biblioteca.autor.entity.Autor;
import com.biblioteca.autor.repository.AutorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AutorServiceImpl implements AutorService{

    private AutorRepository autorRepository;

    @Override
    public void save(Autor autor) {
        autorRepository.save(autor);
    }


    @Override
    public List<Autor> findByNombreLibro(String nombreLibro) {
        return autorRepository.findByNombreLibro(nombreLibro);
    }

    @Override
    public List<Autor> findAll() {
        return autorRepository.findAll();
    }
}
