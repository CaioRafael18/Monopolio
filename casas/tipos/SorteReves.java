package casas.tipos;

import casas.Casa;
import jogo.Jogador;

public class SorteReves extends Casa {
    public SorteReves(String nome, int posicao) {
        super(nome, posicao);
    }

    @Override
    public String getTipo() {
        return "Sorte/Reves";
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