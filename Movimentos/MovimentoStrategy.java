package Movimentos;

import jogo.Jogador;
import jogo.Tabuleiro;

public interface MovimentoStrategy {
    void executarMovimento(Jogador jogador, Tabuleiro tabuleiro, int movimento);
}