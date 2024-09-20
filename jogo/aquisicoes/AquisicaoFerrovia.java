package jogo.aquisicoes;

import casas.tipos.Ferrovia;
import jogo.Aquisicao;

public class AquisicaoFerrovia extends Aquisicao {
    private int corrida;

    public AquisicaoFerrovia(Ferrovia ferrovia) {
        super(ferrovia.getPreco(), ferrovia.getHipoteca());
        this.corrida = 15;
    }

    public int getCorrida() {
        return corrida;
    }
}
