package casas.pontos;

import casas.Ponto;
import jogo.Jogador;

public class VaiPrisao extends Ponto {
    public VaiPrisao(String nome, int posicao) {
        super(nome, posicao);
    }

    @Override
    public String getTipo() {
        return "Prisão";
    }

    @Override
    public void executarAcao(Jogador jogador) {
        System.out.println("O peão de " + jogador.getNome() + " Caiu em " + this.getNome() + " e está preso.");
        jogador.setEstaNaPrisao(true);
    }
}
