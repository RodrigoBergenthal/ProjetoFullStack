package Exercicios;

public class Produto {
    public String nome;
    public double preco;

    @Override
    public String toString(){
        return String.format("\n Nome: %s \n Preço: R$ %s \n", nome, preco);
    }
}