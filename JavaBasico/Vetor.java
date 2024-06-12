import java.util.Arrays;

public class Vetor {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros [0] = 1;
        numeros [1] = 2;
        numeros [2] = 3;
        numeros [3] = 4;
        numeros [4] = 5;
              
        System.out.println(numeros); // imprime o tipo (I) e o endereço de memória I@2c7b84de

        System.out.println("--------------------");

        for (int i=0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        System.out.println("--------------------");

        String [] letras = new String[6];

        letras[0] = "D";
        letras[1] = "A";
        letras[2] = "N";
        letras[3] = "I";
        letras[4] = "E";
        letras[5] = "L";

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        System.out.println("--------------------");

        String[] outraFormaEntradaArray = {"a","c","f","z","x"};

        for (int i = 0; i < outraFormaEntradaArray.length; i++) {
            System.out.println(outraFormaEntradaArray[i]);
        }

        System.out.println("--------------------");

        System.out.println(Arrays.toString(outraFormaEntradaArray)); // outra forma de saida. Essa gerenciada pelo java.

        System.out.println("--------------------");

        // maior, menor e media de um array

        int[] valores = {10, 12, 4, 5, 9};

        int menor = valores[0];
        int maior = valores[0];
        int media = 0;

        for (int i = 0; i < valores.length; i++) {
            if(valores[i] > maior){
                maior = valores[i];
            }
            if(valores[i] < menor){
                menor = valores[i];
            }

            media += valores[i];
        }
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Media: " + media / valores.length);
        



    }

}
