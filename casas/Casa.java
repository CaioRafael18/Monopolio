package casas;

import jogo.Jogador;

public abstract class Casa {
    protected String nome;
    private Jogador proprietario;
    protected int posicao;
    
    public Casa(String nome, int posicao) {
        this.nome = nome;
        this.posicao = posicao;
        this.proprietario = null;
    }

    public String getNome() {
        return nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public Jogador getProprietario(){
        return this.proprietario;
    }

    public void setProprietario(Jogador proprietario){
        this.proprietario = proprietario;
    }

    public abstract String getTipo();
    public abstract void venderCasa(Jogador jogadorComprador);
    public abstract void ofertarVendaCasa(Jogador jogador);
    public abstract void executarAcao(Jogador jogador);
}