/**
 * @author Manoel
 * @version 18/03/2022
 */
public class Funcionario extends Pessoa{
    private String cargo;

    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Funcionario(){}
    public  Funcionario(String nome, String telefone, String cargo){
        super(nome, telefone);
        this.cargo = cargo;
    }
    public void imprimeDados(String telefone){
        System.out.println("Telefone: " +telefone);
    }
    void imprimeDados(){
        System.out.println("Nome: " +getNome());
        imprimeDados(getTelefone());
        System.out.println("Cargo: " +this.cargo);
    }
}

