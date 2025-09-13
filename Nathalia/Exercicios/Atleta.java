package Exercicios;

public class Atleta {
    public String nome;
    public String modalidade;
    public double pontuacao;

    public Atleta(String nome, String modalidade, double pontuacao){
        this.nome = nome;
        this.modalidade = modalidade;
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString(){
        return String.format("\n Nome do atleta: %s \n Modalidade: %s \n Pontuação: %s \n", nome, modalidade, pontuacao);
    }
}