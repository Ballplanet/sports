public class Usuario{
  private String nome = null;
  private String email = null;
  private String cpf = null;
  private String telefone = null ;
  
  public Usuario(int salvarDados){}
  
  public void setNome(String nome){this.nome = nome;}
  public String getNome(){return nome;}
  public void setEmail(String email){this.email = email;}
  public String getEmail(){return email;}
  public void setCpf(String cpf){this.cpf = cpf;}
  public String getCpf(){return cpf;}
  public void setTelefone(String Telefone){this.telefone = telefone;}
  public String getTelefone(){return telefone;}
}
