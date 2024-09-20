package casas.tipos;

import casas.Casa;
import jogo.Jogador;

public class Ferrovia extends Casa{
    int preco;
    int hipoteca;
    
    public Ferrovia(String nome, int posicao, int preco, int hipoteca) {
        super(nome, posicao);
        this.preco = preco;
        this.hipoteca = hipoteca;
    }

    public int getPreco(){
        return preco;
    }

    @Override
    public String getTipo() {
        return "Ferrovia";
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
