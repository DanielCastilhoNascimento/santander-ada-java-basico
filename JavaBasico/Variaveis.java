public class Variaveis {

    //8 tipos de dados primitivos

    public static void main(String[] args) {

        String nome = "Daniel";                 //String não é um tipo primitivo
        System.out.println("Ola, " + nome);
        
        nome = "Silvana";
        System.out.println("Ola " + nome);

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multimplicacao = a * b;
        float divisao = (float) a / b;   // Casting - O java entende o calculo entre dois inteiros o resultado será inteiro.

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multimplicacao);
        System.out.println(divisao);

    }

}
