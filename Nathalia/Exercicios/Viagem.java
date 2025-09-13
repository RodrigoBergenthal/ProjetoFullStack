package Exercicios;

public class Viagem {
    public String destino;
    public int duracaoDias;

    public Viagem(String destino, int duracaoDias){
        this.destino = destino;
        this.duracaoDias = duracaoDias;
    }

    @Override
    public String toString(){
        return String.format("\n Seu destino é %s, e vai durar %s dias.", destino, duracaoDias);
    }
}