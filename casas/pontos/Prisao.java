package casas.pontos;

import casas.Ponto;

public class Prisao extends Ponto {
    public Prisao(String nome, int posicao) {
        super(nome, posicao);
    }

    @Override
    public String getTipo() {
        return "Prisão";
    }
}
