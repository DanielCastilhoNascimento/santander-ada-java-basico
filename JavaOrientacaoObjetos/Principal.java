import Animais.Cachorro;
import Animais.Gato;

public class Principal {

    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro("Théo","Caramelo",50,25,13,"carinho");
        Cachorro cachorro2 = new Cachorro("Nick","Branco",25,10,6,"vai dormir");
        Gato gato1 = new Gato("Takashi","Preto e Branco",18,4,20,"nada");


        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());

        System.out.println("-------------------");

        System.out.println(cachorro1.getNumeroDeCachorros());
        System.out.println(cachorro2.getNumeroDeCachorros()); //Mostra quantos cachorros foram criados na classe. Tanto faz ser cachorro1 ou 2.

        //testando objetos com os contrutores
        System.out.println("-------------------");
        System.out.println(cachorro1.getNome());
        System.out.println(cachorro2.getNome());
        System.out.println(gato1.getNome());
        System.out.println("-------------------");

        //chamando os métodos
        cachorro1.latir();
        
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir"));
        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.interagir("nada"));

        System.out.println("O gato esta " + gato1.interagir("carinho"));
        System.out.println("O gato esta " + gato1.interagir("vai dormir"));
        System.out.println("O gato esta " + gato1.interagir("pisei no rabo"));
        System.out.println("O gato esta " + gato1.interagir("nada"));


        
        
        
        
    }

}
