package command;

import jogo.Jogador;
import jogo.Jogo;
import jogo.Tabuleiro;

public interface Command {
    void executar(Jogador jogador, Tabuleiro tabuleiro, Jogo jogo);
}
