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
    public void venderCasa(Jogador jogadorComprador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'venderCasa'");
    }

    @Override
    public void ofertarVendaCasa(Jogador jogador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ofertarVendaCasa'");
    }

    @Override
    public void executarAcao(Jogador jogador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executarAcao'");
    }
}
