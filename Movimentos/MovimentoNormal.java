package Movimentos;

import jogo.Jogador;
import jogo.Tabuleiro;
import casas.Casa;

public class MovimentoNormal implements MovimentoStrategy {
    public void executarMovimento(Jogador jogador, Tabuleiro tabuleiro, int movimento) {
        int novaPosicao = (jogador.getPosicao() + movimento) % tabuleiro.getQuantidadeCasas();
        jogador.setPosicao(novaPosicao);
        Casa casaAtual = tabuleiro.getCasa(novaPosicao);
        
        casaAtual.executarAcao(jogador);

        // colocar ação da casa
        System.out.println("------------------------------------------------------------");
    }
}
