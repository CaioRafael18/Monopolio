package casas;

import jogo.Jogador;

public class Ponto extends Casa {
    public Ponto(String nome, int posicao) {
        super(nome, posicao);
    }

    @Override
    public String getTipo() {
        return "Ponto";
    }

    @Override
    public void venderCasa(Jogador jogadorComprador) {}

    @Override
    public void ofertarVendaCasa(Jogador jogador) {}

    @Override
    public void executarAcao(Jogador jogador) {}
}
