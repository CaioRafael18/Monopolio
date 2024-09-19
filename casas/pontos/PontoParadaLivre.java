package casas.pontos;

import casas.Ponto;

public class PontoParadaLivre extends Ponto {
    public PontoParadaLivre(String nome, int posicao) {
        super(nome, posicao);
    }

    @Override
    public String getTipo() {
        return "Parada Livre";
    }
}
