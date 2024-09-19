package casas.tipos;

import casas.Casa;
import casas.TipoImposto;

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
}
