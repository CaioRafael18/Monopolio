package casas.tipos;

import casas.Casa;
import jogo.Jogador;

public class ServicoPublico extends Casa {
    int valor;
    int hipoteca;

    public ServicoPublico(String nome, int posicao, int valor, int hipoteca) {
        super(nome, posicao);
        this.valor = valor;
        this.hipoteca = hipoteca;
    }

    @Override
    public String getTipo() {
        return "ServicoPublico";
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
