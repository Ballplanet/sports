import java.util.Scanner;//importa o scanner
import java.util.Calendar;//importa o calendario

/**
 * @author ManoelJr
 * @version 22/11/21
 *
 */

public class Sport {
    public static void main(String[] args) {
        /*objeto de scanner*/
        Scanner people = new Scanner(System.in);
        int idade;
        String email;
        String telefone;
        String name;
        String CPF;
        int anoDeNasci;
        int anoAtual;

        System.out.println("Digite seu nome completo: ");
        name = people.nextLine();
        System.out.println("Digite seu email: ");
        email = people.nextLine();
        System.out.println("Digite seu Telefone: ");
        telefone = people.nextLine();
        System.out.println("Digite seu cpf sem caracter: ");
        CPF = people.nextLine();
        System.out.println("digite o ano de Nascimento: ");
        anoDeNasci = people.nextInt();

        //criando um objeto do tipo Calendar
        Calendar calendario = Calendar.getInstance();
        anoAtual = calendario.get(Calendar.YEAR);
        idade = anoAtual - anoDeNasci;


        System.out.println(name);
        System.out.println("O email informado é:\n " +email);
        System.out.println("O telefone informado é:\n " +telefone);
        System.out.println("Tem "+ idade + " anos");
        System.out.println("O cpf informado é \n" +CPF);
    }
}
