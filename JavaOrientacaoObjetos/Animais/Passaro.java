package Animais;

public class Passaro extends Animal{
    static int numeroDePassaros;    

    public Passaro() {
    }

    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDePassaros++;
    }




}


