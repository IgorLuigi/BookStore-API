package com.igorluigi.bookstore.domain;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private Integer id;
    private String nome;
    private String descricao;

    // Criando um array de livros
    private List<Livro> livros = new ArrayList<>();

    // Construtor SUPER(Sem parâmetros)
    public Categoria() {
        super();
    }

    public Categoria(Integer id, String nome, String descricao) {
        super();
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Categoria other = (Categoria) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

}
