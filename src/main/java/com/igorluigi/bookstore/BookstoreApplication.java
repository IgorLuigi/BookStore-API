package com.igorluigi.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.igorluigi.bookstore.domain.Categoria;
import com.igorluigi.bookstore.domain.Livro;
import com.igorluigi.bookstore.repositories.CategoriaRepository;
import com.igorluigi.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{

	@Autowired 
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria categoria1 = new Categoria(null, "Aventura", "Livros de Aventura");

		Livro livro1 = new Livro(null, "Senhor dos Anéis Parte I", "John Ronald Reuel Tolkien", "Lorem ipsum", categoria1);
		
		categoria1.getLivros().addAll(Arrays.asList(livro1));

		this.categoriaRepository.saveAll(Arrays.asList(categoria1));
		this.livroRepository.saveAll(Arrays.asList(livro1));
	}

}
