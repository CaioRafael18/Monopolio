package Movimentos;

import jogo.Jogador;
import jogo.Tabuleiro;

public class MovimentoPrisioneiro implements MovimentoStrategy{
    @Override
    public void executarMovimento(Jogador jogador, Tabuleiro tabuleiro, int movimento) {
        if (jogador.getNumeroTentativas() < 3) {
            System.out.println("O jogador " + jogador.getNome() + " não conseguiu sair da prisão!");
            jogador.incrementaTentativas();
        } else{
            System.out.println(jogador.getNome() + " terá que pagar $50 para sair da Prisão.");
            jogador.pagar();
            jogador.setEstaNaPrisao(false);
            jogador.setPosicao(30);
            System.out.println("O jogador " + jogador.getNome() + " conseguiu sair da prisão e avançou " + movimento + " casas.");
        }
    }
}
