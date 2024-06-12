import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsDatas {
    public static void main(String[] args) {
        String nome = "Daniel Castilho do Nascimento";

        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());

        String nomeOutro = "DANIEL CASTILHO DO NASCIMENTO";

        System.out.println(nome.equals(nomeOutro));  //Retorna um boleano. false porque não são iguais.
        System.out.println(nome.equalsIgnoreCase(nomeOutro));  //ignora maiusculos e minusculos


        System.out.println("=======================================================");


        //data ISO 8601 - REPRESENTA DATA EM FORMATO PADRÃO

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek());

        Locale brasil = new Locale("pt","BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao = "";

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);  //Data e horarios completos
        int horaAtual = agora.getHour(); // apenas hora

        if(horaAtual >= 0 && horaAtual < 12){
            saudacao = "Bom dia!";
        } else if(horaAtual >= 12 && horaAtual < 18){
            saudacao = "Boa tarde!";
        } else if(horaAtual >= 18 && horaAtual < 24){
            saudacao = "Boa noite!";
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("Olá, %s. Hoje é %s, %s%n.", nome, diaSemana, saudacao.toUpperCase());

    }

}
