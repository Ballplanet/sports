import java.util.Scanner;//importa o scanner
import java.util.Calendar;//importa o calendario

/**
 * @author ManoelJr
 * @version 22/11/21
 *
 */

public class Sport {
    public static void menu() {
        System.out.println("\tCadastro de Usuario");
        System.out.println("0. | +-------fim-------+ |");
        System.out.println("1. | +-----INCLUIR-----+ |");
        System.out.println("2. | +----VER DADOS----+ |");
        System.out.println("3. | +---VER HORARIO---+ |");
        System.out.println("Opção: ");

    }

    public static void main(String[] args) {
        int opcao;
        Scanner people = new Scanner(System.in);
        int idade, horario = 0;
        String email = null;
        String telefone = null;
        String name = null;
        String CPF = null;
        int anoDeNasci = 0;
        int anoAtual;
        
        Scanner entrada = new Scanner(System.in);
        do {
            menu();
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.println("Digite seu nome completo: ");
                name = people.nextLine();
                System.out.println("Digite seu email: ");
                email = people.nextLine();
                System.out.println("Digite seu Telefone: ");
                telefone = people.nextLine();
                System.out.println("Digite seu cpf: ");
                CPF = people.nextLine();
                System.out.println("digite o ano de Nascimento: ");
                anoDeNasci = people.nextInt();
                System.out.println("Qual o Horario do jogo [1 = Manhã / 2 = Tarde / 3 = Noite");
                do{
                    horario = entrada.nextInt();
                }while(horario != 1 && horario != 2 && horario != 3);
                
            } else if (opcao == 2) {
                Calendar calendario = Calendar.getInstance();
                anoAtual = calendario.get(Calendar.YEAR);
                idade = anoAtual - anoDeNasci;
                System.out.println(name);
                System.out.println("O email informado é:\n " + email);
                System.out.println("O telefone informado é:\n " + telefone);
                System.out.println("Tem " + idade + " anos");
                System.out.println("O cpf informado é \n" + CPF);
                
            } else if(opcao == 3){
                System.out.println("Horario Marcado");
                if (horario == 1 ){
                    System.out.println("Manha");
                }else if (horario == 2){
                    System.out.println("Tarde");
                }else if (horario == 3){
                    System.out.println("Noite");
                }
                
            } else if(opcao == 0){
                System.out.println("fim do programa!");
            } else{ System.out.println("Opção invalida");}

        } while (opcao != 0);

    }
}
