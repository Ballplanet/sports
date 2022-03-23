/**
 * @author Manoel
 * @version 18/03/2022
 */
import java.util.ArrayList;

public final class Time {
    private int tamanhoTime;
    private Tecnico tecnico;
    private ArrayList<Jogador> jogadores;
    private String quadra;

    public Time() {
        this.tamanhoTime = 1;
        this.jogadores = new ArrayList<>();
    }
    public Time(Tecnico tecnico, String quadra) {
        this();
        this.tecnico = tecnico;
        this.quadra = quadra;
    }
    public Time(int tamanhoTime) {
        this();
        this.tamanhoTime = tamanhoTime;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void adicionaJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    public void adicionaTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String getQuadra() {
        return quadra;
    }
    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }
    public boolean quantJogadoresCompleto() {
        return this.jogadores.size() == this.tamanhoTime;
    }


}
