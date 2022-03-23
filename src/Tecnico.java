/**
 * @author Manoel
 * @version 18/03/2022
 */

public class Tecnico extends Pessoa{
    private Pessoa tecnico;
    private double codigo;

    public double getCodigo(){return codigo;}
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }
    public Tecnico(){}
    public Tecnico(String nome){}

    public Tecnico(String nome, String cpf, String telefone, double codigo){
        super(nome, cpf, telefone);
        this.codigo = codigo;
    }
    public void imprimeDados(String telefone) {System.out.println("Telefone: " +telefone);}

    void imprimeDados(){
        System.out.println("Tecnico: "+getNome());
    }
}
