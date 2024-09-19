package casas.tipos;

import casas.Casa;

public class SorteReves extends Casa {
    public SorteReves(String nome, int posicao) {
        super(nome, posicao);
    }

    @Override
    public String getTipo() {
        return "Sorte/Reves";
    }
}