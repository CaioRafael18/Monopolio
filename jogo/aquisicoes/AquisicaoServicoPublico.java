package jogo.aquisicoes;

import casas.tipos.ServicoPublico;
import jogo.Aquisicao;

public class AquisicaoServicoPublico extends Aquisicao {
    public AquisicaoServicoPublico(ServicoPublico servicoPublico) {
        super(servicoPublico.getPreco(), servicoPublico.getHipoteca());
    }
}
