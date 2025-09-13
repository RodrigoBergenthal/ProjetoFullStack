package Exercicios;

public class Filme {
    public String titulo;
    public String genero;
    public double avaliacao;

    public Filme(String titulo, String genero, double avaliacao){
        this.titulo = titulo;
        this.genero = genero;
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString(){
        return String.format("\n Nome do filme: %s \n Gênero: %s \n Avaliação: %s \n", titulo, genero, avaliacao);
    }
}