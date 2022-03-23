/**
 * @author Manoel
 * @version 18/03/2022
 */

public abstract class Pessoa {
    private String cpf;
    private String email = null;
    private String telefone = null;
    private String nome;
    private short tipoHorario;

    public Pessoa(int salvarDados) {}
    public Pessoa(){}
    public Pessoa(String nome) {
    }
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    public abstract void imprimeDados(String telefone);

    public Pessoa(String nome, String cpf, String telefone){
        this.getNome();
        this.getCpf();
        this.getTelefone();
    }
    private Funcionario funcionario;
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario){
        this.funcionario = funcionario;
    }

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {return email;}
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {return nome;}
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public short getTipoHorario(){return tipoHorario;}
    public void setTipoHorario(short tipoHorario) {
        this.tipoHorario = tipoHorario;
    }
    void imprimeDados(){
        System.out.println("Nome: "+ this.nome);
    }

}
