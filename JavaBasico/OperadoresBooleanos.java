public class OperadoresBooleanos {

    public static void main(String[] args) {
        boolean resultado = false;
        System.out.println(resultado);

        System.out.println("--------------------");

        boolean fimDeSemana = true;
        boolean fazendoSol = true;

        //Operadores &&(e) e || (ou)
        //tabela verdade = && para ser verdade as duas condiçoes tem que ser true
        //|| para ser verdade uma codição ou outra tem que ser true

        if(fimDeSemana && fazendoSol){
            System.out.println("Vamos a praia");
        } else{
            System.out.println("Vamos trabalhar");
        }
        
        System.out.println("--------------------");

        //Operador ternario

        String mensagem = fimDeSemana ? "Vamos descancar" : "Trabalhando";
        System.out.println(mensagem);

    }

}
