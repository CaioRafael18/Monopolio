package jogo.aquisicoes;

import casas.tipos.Propriedade;
import jogo.Aquisicao;

public class AquisicaoPropriedade extends Aquisicao {
    private int aluguel;

    public AquisicaoPropriedade(Propriedade propriedade) {
        super(propriedade.getPreco(), propriedade.getHipoteca());
        this.aluguel = propriedade.getAluguel();
    }

    public int getAluguel() {
        return aluguel;
    }
}
