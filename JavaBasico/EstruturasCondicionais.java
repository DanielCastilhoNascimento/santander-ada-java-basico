public class EstruturasCondicionais {

    public static void main(String[] args) {

        System.out.println("Exemplo 1");
        int nota = 70;

        if(nota >= 70){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }

        System.out.println("--------------------");

        System.out.println("Exemplo 2");

        int media = 60;

        if(media >= 90){
            System.out.println("Graduação A");
        }else if(media >= 80){
            System.out.println("Graduação B");
        }else if(media >= 60){
            System.out.println("Graduação C");
        }else if(media >= 0 ){
            System.out.println("Graduação D");
        }else{
            System.out.println("Graduação Invalida");
        }

        System.out.println("--------------------");

        System.out.println("Exemplo 3");

        int pontuacao = 50;
        String graduacao = null;

        if(pontuacao >= 80){
            graduacao = "A";
        }else if(pontuacao < 80 && pontuacao >= 70){
            graduacao = "B";
        }else if(pontuacao < 70 && pontuacao >= 60){
            graduacao = "C";
        }else if(pontuacao < 60 && pontuacao >= 0){
            graduacao = "D";
        }else{
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
            System.out.println("Aluno aprovado");
                break;
            case "C":
            case "D":
            System.out.println("Aluno reprovado");    
                break;        
            default:
            System.out.println("Pontuação invalida");
                break;
        }     
        
    }

}
