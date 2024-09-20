package command;

import jogo.Jogador;
import jogo.Jogo;
import jogo.Tabuleiro;

public class PagarCommand implements Command{
    @Override
    public void executar(Jogador jogador, Tabuleiro tabuleiro, Jogo jogo) {
        jogador.pagar();
        jogador.setEstaNaPrisao(false);
        System.out.println("O jogador " + jogador.getNome() + " Pagou para sair da prisão!");
    }
}
