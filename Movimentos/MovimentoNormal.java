package Movimentos;

import jogo.Jogador;
import jogo.Tabuleiro;
import casas.Casa;

public class MovimentoNormal implements MovimentoStrategy{
    public void executarMovimento(Jogador jogador, Tabuleiro tabuleiro, int movimento) {
            int novaPosicao = (jogador.getPosicao() + movimento);
            jogador.setPosicao(novaPosicao);
            Casa casaAtual = tabuleiro.getCasa(novaPosicao);
            if (casaAtual.getPosicao() == 30){
                System.out.println("O peão de " + jogador.getNome() + " Caiu em " + casaAtual.getNome() + " e está preso.");
                jogador.setEstaNaPrisao(true);
            }
            // colocar ação da casa
            System.out.println("------------------------------------------------------------");
    }
}
