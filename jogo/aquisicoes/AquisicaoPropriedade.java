package jogo.aquisicoes;

import casas.tipos.Propriedade;
import jogo.Aquisicao;

public class AquisicaoPropriedade extends Aquisicao {
    public AquisicaoPropriedade(Propriedade propriedade) {
        super(propriedade.getPreco(), propriedade.getHipoteca(), propriedade.getNome(), propriedade.getNome(), propriedade.getCorGrupo(), propriedade.getAluguel());
    }
}
