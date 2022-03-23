/**
 * @author Manoel
 * @version 23/03/2022
 */

public class Funcionario extends Pessoa{
    private String cargo;

    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Funcionario(){}
  
    public void imprimeDados(String telefone){
        System.out.println("Telefone: " +telefone);
    }
}
