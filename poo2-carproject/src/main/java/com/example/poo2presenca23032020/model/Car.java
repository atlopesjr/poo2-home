package com.example.poo2presenca23032020.model;

/**
 * Car
 */
public class Car {
    private int codigo;
    private String marca;
    private String modelo;
    private String cor;
    private double preco;

    public Car(int codigo, String marca, String modelo, String cor, double preco) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Car [codigo=" + codigo + ", cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + ", preco=" + preco
                + "]";
    }
    
}