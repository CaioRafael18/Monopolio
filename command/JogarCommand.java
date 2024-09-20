package command;

import Movimentos.MovimentoNormal;
import Movimentos.MovimentoPrisioneiro;
import casas.Casa;
import jogo.Dados;
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
        Dados dados = new Dados();

        if (jogador.estaNaPrisao()) {
            if (dados.getDado1() != dados.getDado2()) {
                jogador.setMovimentoStrategy(new MovimentoPrisioneiro());
            } else {
                System.out.println("O jogador " + jogador.getNome() + " tirou " + dados.getDado1() + " e " + dados.getDado2() + " e conseguiu sair da prisão, avançou " + dados.getMovimento() + " casas. Está em " + casaAtual.getNome());
                jogador.setEstaNaPrisao(false);
                jogador.setMovimentoStrategy(new MovimentoNormal());
            }
        } else {
            jogador.setMovimentoStrategy(new MovimentoNormal());
        }
        jogador.setDados(dados);
        jogador.movimentar(dados.getMovimento(), tabuleiro);
    }
}
