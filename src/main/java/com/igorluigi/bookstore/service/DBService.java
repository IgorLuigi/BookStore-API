package com.igorluigi.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igorluigi.bookstore.domain.Categoria;
import com.igorluigi.bookstore.domain.Livro;
import com.igorluigi.bookstore.repositories.CategoriaRepository;
import com.igorluigi.bookstore.repositories.LivroRepository;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBaseDeDados() {
        
        Categoria categoria1 = new Categoria(null, "Aventura", "Livros de Aventura");

        Livro livro1 = new Livro(null, "Senhor dos Anéis Parte I", "John Ronald Reuel Tolkien", "Lorem ipsum",
                categoria1);

        categoria1.getLivros().addAll(Arrays.asList(livro1));

        this.categoriaRepository.saveAll(Arrays.asList(categoria1));
        this.livroRepository.saveAll(Arrays.asList(livro1));
    }

}
