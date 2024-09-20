package Movimentos;

import jogo.Jogador;
import jogo.Tabuleiro;

public class MovimentoPrisioneiro implements MovimentoStrategy{
    @Override
    public void executarMovimento(Jogador jogador, Tabuleiro tabuleiro, int movimento) {
        jogador.incrementaTentativas();

        if (jogador.getNumeroTentativas() >= 3) {
            System.out.println("O jogador " + jogador.getNome() + " não conseguiu sair da prisão após 3 tentativas e terá que pagar $50.");
            jogador.pagar();

            jogador.setEstaNaPrisao(false);
            System.out.println("O jogador " + jogador.getNome() + " avançou " + movimento + " casas.");
        } else {
            System.out.println("O jogador " + jogador.getNome() + " não tirou dados iguais e continua preso.");
        }
        System.out.println("------------------------------------------------------------");
    }
}
