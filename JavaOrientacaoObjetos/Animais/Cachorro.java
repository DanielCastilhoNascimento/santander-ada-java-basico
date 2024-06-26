package Animais;

public class Cachorro {

    //atributos
    static int numeroDeCachorros; //Atributo static é global. Serve para todos os objetos.
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    //construtores

    public Cachorro(){

    }

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    }

    //métodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }
    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }
    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public void latir(){
        System.out.println("Au Au Au");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        if (acao.equals("carinho")) {
            this.estadoDeEspirito = "Feliz";
        } else if(acao.equals("vai dormir")) {
            this.estadoDeEspirito = "Bravo";
        } else{
            this.estadoDeEspirito = "Neutro";
        }
        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        //Restringindo o campo como único. Não
        return "Cachorro [nome=" + nome + "]";
    }    

}
