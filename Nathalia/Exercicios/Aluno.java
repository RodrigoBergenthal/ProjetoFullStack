package Exercicios;

public class Aluno {
    public String nome;
    public int nota;

    public Aluno(String nome, int nota){
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString(){
        return String.format("\n Aluno: %s \n Nota do aluno: %s \n", nome, nota);
    }
}