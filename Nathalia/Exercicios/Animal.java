package Exercicios;

public class Animal {
    public String nome;
    public String especie;

    public Animal(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }

    @Override
    public String toString(){
        return String.format("\n Nome do animal: %s \n Espécie: %s \n", nome, especie);
    }
}