/**
 * @author Manoel
 * @version 18/03/2022
 */
public class Jogador extends Pessoa {
    private double codigo;
    private String posicao;

    public double getCodigo(){return codigo;}
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }
    public String getPosicao(){return posicao;}
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public Jogador(){
    }
    public Jogador(String nome, String cpf, String telefone, double codigo, String posicao){
        super(nome, cpf, telefone);
        this.codigo = codigo;
        this.posicao = posicao;
    }
    public void imprimeDados(String telefone) {
        System.out.println("Telefone: " + telefone);
    }
    void imprimeDados(){
        System.out.println("Jogador: "+ getNome());
        System.out.println("Posição: "+ this.posicao);
    }
}
