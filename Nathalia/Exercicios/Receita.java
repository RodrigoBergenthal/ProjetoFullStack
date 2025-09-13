package Exercicios;

public class Receita {
    public String nome;
    public int tempoPreparo;

    public Receita(String nome, int tempoPreparo){
        this.nome = nome;
        this.tempoPreparo = tempoPreparo;
    }

    @Override
    public String toString(){
        return String.format("\n Nome da receita: %s \n Tempo de preparo: %s minutos \n", nome, tempoPreparo);
    }
}