package casas.tipos;

import casas.Casa;

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
    public void executarAcao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executarAcao'");
    }
}
