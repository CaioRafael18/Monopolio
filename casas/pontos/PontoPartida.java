package casas.pontos;

import casas.Ponto;

public class PontoPartida extends Ponto {
    public PontoPartida(String nome, int posicao) {
        super(nome, posicao);
    }

    @Override
    public String getTipo() {
        return "Partida";
    }
}
