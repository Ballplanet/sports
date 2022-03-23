public enum FuncionarioEnum {
    FUNCIONARIO1("Francisco Magamonte de Sá"),
    FUNCIONARIO2("Cristiane da Silveira");

    private String descricao;

    FuncionarioEnum(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
