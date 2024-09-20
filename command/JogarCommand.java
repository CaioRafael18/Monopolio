package command;
import java.util.Random;

import Movimentos.MovimentoNormal;
import Movimentos.MovimentoPrisioneiro;
import casas.Casa;
import jogo.Jogador;
import jogo.Jogo;
import jogo.Tabuleiro;

public class JogarCommand implements Command{
    @Override
    public void executar(Jogador jogador, Tabuleiro tabuleiro, Jogo jogo){
        jogarDados(jogador, tabuleiro);
        jogo.setJogadorAtual((jogo.getJogadorAtual() + 1) % jogo.getJogadores().size());
    }

    private void jogarDados(Jogador jogador, Tabuleiro tabuleiro){
        Casa casaAtual = tabuleiro.getCasa(jogador.getPosicao());
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int movimento = dado1 + dado2;

        if (jogador.estaNaPrisao()) {
            if (dado1 != dado2) {
                jogador.setMovimentoStrategy(new MovimentoPrisioneiro());
            } else {
                System.out.println("O jogador " + jogador.getNome() + " tirou " + dado1 + " e " + dado2 + " e conseguiu sair da prisão, avançou " + movimento + " casas. Está em " + casaAtual.getNome());
                jogador.setEstaNaPrisao(false);
                jogador.setMovimentoStrategy(new MovimentoNormal());
            }
        } else {
            jogador.setMovimentoStrategy(new MovimentoNormal());
        }
        jogador.movimentar(movimento, tabuleiro);
    }
}
