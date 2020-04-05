package com.example.poo2bookproject.model;

/**
 * Book
 */
public class Book {
    private int codigo;
    private String titulo;
    private String genero;
    private String autor;
    private double preco;

    public Book(int codigo, String titulo, String genero, String autor, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Book [autor=" + autor + ", codigo=" + codigo + ", genero=" + genero + ", preco=" + preco + ", titulo="
                + titulo + "]";
    }
    
}