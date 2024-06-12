import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {

        // corpo do programa
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome : ");
        String nomeOriginal = scanner.nextLine();           //exemplificando o escopo das variaveis
        saudacao(nomeOriginal);

        int resultado = soma(2, 4);

        scanner.close();
    }

    //função 1 é void - sem retorno.
    public static void saudacao(String nomeParametro){      //exemplificando o escopo das variaveis
        System.out.println("Ola, Seja bem vindo! " + nomeParametro);

    }
    

    //função 2 tem retorno inteiro
    public static int soma(int a, int b){
        return a + b;
    }

    
}
