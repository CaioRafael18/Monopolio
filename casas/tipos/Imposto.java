package casas.tipos;

import casas.Casa;
import casas.TipoImposto;
import jogo.Jogador;

public class Imposto extends Casa{
    private TipoImposto imposto;

    public Imposto(String nome, int posicao, TipoImposto imposto) {
        super(nome, posicao);
        this.imposto = imposto;
    }

    @Override
    public String getTipo() {
        return "Imposto";
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
