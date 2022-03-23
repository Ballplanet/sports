/**
 * @author Manoel
 * @version 23/03/2022
 */
import java.util.Scanner;
import java.util.Random;

public class PartidaTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        new Funcionario();
        final int QUANTIDADEJOGADORES = 5;
        Time time1 = new Time(QUANTIDADEJOGADORES);
        Time time2 = new Time(QUANTIDADEJOGADORES);
        int menu_opcao;
        boolean menu = true;
        System.out.println("\n\tA sesguir iremos mostrar o funcionario " +
                            "que ira cotinuar com o cadastro\n");
        Enum();

        do {
            System.out.println("""
                 1- Cadastra Tecnicos e jogadores do Time A e Time B

                 2- Jogadores do Time-A
                 3- Jogadores do Time-B
                 99- **** Sair ****""");
            menu_opcao = scanner.nextInt();
            scanner.nextLine();
            switch (menu_opcao) {
                 case 1 -> {
                     System.out.println("""
                           Escolha as opções:
                              1- Cadastra Tecnico Time A\s
                              2- Cadastra Tecnico Time B
                              3- Cadastra Jogadores Time A\s
                              4- Cadastra Jogadores Time B""");
                      menu_opcao = scanner.nextInt();
                      scanner.nextLine();
                      switch (menu_opcao) {
                           case 1 -> cadastraTecnico(time1);
                           case 2 -> cadastraTecnico(time2);
                           case 3 -> cadastrarJogador(time1);
                           case 4 -> cadastrarJogador(time2);
                       }
                   }
                   case 2 -> {
                       System.out.println("\n------Time A------");
                       imprimirDadosTime(time1);
                   }
                   case 3 -> {
                       System.out.println("\n------Time B------");
                       imprimirDadosTime(time2);
                   }
                   case 99 -> menu = false;
             }
        } while (menu);
   }
    private static void imprimirDadosTime(Time time) {
        imprimeDados(time.getTecnico());
        for (Jogador jogador : time.getJogadores()) {
            imprimeDados(jogador);
        }
    }

    private static void cadastrarJogador(Time time) {
        if (!time.quantJogadoresCompleto()) {
            Jogador jogador = new Jogador();
            System.out.println("Informe o nome do Jogador: ");
            jogador.setNome(scanner.nextLine());
            System.out.println("Informe qual a posição do Jogador: ");
            jogador.setPosicao(scanner.nextLine());
            time.adicionaJogador(jogador);
        } else {
            System.out.println("Time completo!");
        }
    }
    private static void cadastraTecnico(Time time){
        Tecnico tecnico = new Tecnico();
        if (time.getTecnico() == null) {
            System.out.println("Informe o nome do tecnico: ");
            tecnico.setNome(scanner.nextLine());
            time.adicionaTecnico(tecnico);
        }else System.out.println("Tecnico já cadstrado");
    }
    private static void Enum(){
        Pessoa pessoa = new Funcionario();
        Random opcao = new Random();
        int numero = opcao.nextInt(2);
        switch (numero) {
            case 0 -> {
                pessoa.setFuncionario(FuncionarioEnum.FUNCIONARIO1);
                System.out.println(pessoa.getFuncionario().getDescricao());
            }
            case 1 -> {
                pessoa.setFuncionario(FuncionarioEnum.FUNCIONARIO2);
                System.out.println(pessoa.getFuncionario().getDescricao());
            }
        }
    }
    public static void imprimeDados(Pessoa p){
        if (p != null) p.imprimeDados();
        else System.out.println("Nada cadastrado!");
    }
}
