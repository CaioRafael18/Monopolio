package casas.tipos;

import casas.Casa;

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
    public void executarAcao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executarAcao'");
    }
}
