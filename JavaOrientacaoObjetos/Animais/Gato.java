package Animais;

public class Gato extends Animal{
    //atributos
    static int numeroDeGatos;

    //USANDO O SWITCH
    public String interagir(String acao){

        switch(acao){
            case "carinho":
            this.estadoDeEspirito = "feliz";
            break;
            case "vai dormir":
            this.estadoDeEspirito = "bravo";
            break;
            case "pisei no rabo":
            this.estadoDeEspirito = "triste";
            break;
            default:
            this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;

    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + "]";
    }

    


}
