package Exercicios;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    @Override
    public String toString(){
        return String.format("\n Titulo do Livro: %s \n Autor: %s \n Ano de publicação: %s \n", titulo, autor, anoPublicacao);
    }
}