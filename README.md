# poo-2021-2-ai-ManoelAFJr
poo-2021-2-ai-ManoelAFJr created by GitHub Classroom
* A idéia do projeto é uma pagina ou site de um projeto de uma quadra esportiva, no qual será permitido o cadastro, reserva e horários para jogos. A pagina deve conter um banco de dados para cadastro com um código único de cada integrante cadastrado, o CPF, data de nascimento e nome completo.
* Organização derivada de estudos para fins didáticos 
#
# PlanetaSports ⚽

Atualizações feitas no projeto:
adicionda a pasta com todas as classe.
#


A Classe Pessoa passa a ser abstract 
```Java
public abstract class Pessoa {

    public abstract void imprimeDados(String telefone);

```
Como a Classe Pessoa passa a ser abstract as classes que ela extends terá também algo abstract.

Após a inserção do metodo abstract a Classe funcionario foi implementada, e modificações nas classes Tecnico, jogador e PartidaTest foram feitas.

A constante QUANTIDADEJOGADORES teve a atribuíção final, ja que se trata de uma cosntânte:
```Java
final int QUANTIDADEJOGADORES = valor ;
```
Um menu interativo também foi adicionado, o menu serve para saber qual funcionario irá fazer o cadastro das pessoas jogadores e tecnicos dos times, na PartidaTest foi feito uma mudança em cadastro de tecnico para que haja apenas um único tecnico para cada time:
```java
  if (time.getTecnico() == null) {
  
    }else System.out.println("Tecnico já cadstrado");
```
Em imprimir os dados imprimeDados teve algumas alterações, ja que, ao não digitar nenhum valor para jogadores ou tecnicos o programa era encerrado.

Os funcionários terão os seus valores ja atribuídos pelo programa "@author":
```Java
  Funcionario funcionario1 = new Funcionario("Arnaldo Sacobino",
                    "(83) 97789-4455", "RECEPCIONISTA");
  Funcionario funcionario2 = new Funcionario("Samantha Ivar Hagnalson",
                    "(83) 99939-4455", "GERENTE");
```
A opção de "escrever" funcionarios foi alterada, fazendo uma chamada via Enum, a utilizaçao do enum foi feita para trabalhar o quesito enum na disciplina de POO
 A Class PartidaTest foi alterada rcebendo novos valores ao coódigo:
```java
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
```
Com essa adição no codigo a chamada de Funcionario ficarar mais simples, fazendo o uso de apenas:
```java
Enum();
```
e sempre que o código for reiniciado há possibilidade do funcionario mudar, ja que faz uso de um Random.
