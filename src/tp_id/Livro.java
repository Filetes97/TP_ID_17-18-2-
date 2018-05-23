/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_id;

import java.awt.image.BufferedImage;

/**
 *
 * @author Filipe
 */
class Livro {
   int isbn;
   int cod_autor;
   String titulo;
   String editora;
   double preco;
   BufferedImage FotoCapa;  
   int ano;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getCod_autor() {
        return cod_autor;
    }

    public void setCod_autor(int cod_autor) {
        this.cod_autor = cod_autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public BufferedImage getFotoCapa() {
        return FotoCapa;
    }

    public void setFotoCapa(BufferedImage FotoCapa) {
        this.FotoCapa = FotoCapa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Livro(int isbn, int cod_autor, String titulo, String editora, double preco, BufferedImage FotoCapa, int ano) {
        this.isbn = isbn;
        this.cod_autor = cod_autor;
        this.titulo = titulo;
        this.editora = editora;
        this.preco = preco;
        this.FotoCapa = FotoCapa;
        this.ano = ano;
    }
   
    
}
