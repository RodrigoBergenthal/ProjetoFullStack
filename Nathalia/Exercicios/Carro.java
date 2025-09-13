package Exercicios;

public class Carro {
    public String modelo;
    public int ano;
    public String cor;

    public Carro(String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    @Override
    public String toString(){
        return String.format("\n Seu carro é %s, lançado em %s da cor %s. \n", modelo, ano, cor);
    }
}