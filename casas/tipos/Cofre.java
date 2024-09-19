package casas.tipos;

import casas.Casa;

public class Cofre extends Casa {
    public Cofre(String nome, int posicao) {
        super(nome, posicao);
    }

    @Override
    public String getTipo() {
        return "Cofre";
    }

    @Override
    public void executarAcao() {
        throw new UnsupportedOperationException("Unimplemented method 'executarAcao'");
    }
}