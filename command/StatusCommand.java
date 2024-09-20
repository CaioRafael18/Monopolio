package command;

import casas.Casa;
import jogo.Aquisicao;
import jogo.Jogador;
import jogo.Jogo;
import jogo.Tabuleiro;

public class StatusCommand implements Command {
    @Override
    public void executar(Jogador jogador, Tabuleiro tabuleiro, Jogo jogo) {
        Casa casaAtual = tabuleiro.getCasa(jogador.getPosicao());

        System.out.println("O status de " + jogador.getNome() + " - " + jogador.getCor() + " é o seguinte:");
        System.out.println("Situado na posição " + jogador.getPosicao() + " - " + casaAtual.getNome());
        System.out.println("Possui $" + jogador.getSaldo());

        if(jogador.getPropriedades().isEmpty()){
            System.out.println("Nenhum Título");
        } else {
           System.out.println("Titulos: ");
           for(Aquisicao aquisicao : jogador.getPropriedades()){
            System.out.println("[" + aquisicao.getNome() + "] - " + aquisicao.getTipoPropriedade() + (aquisicao.getCorGrupo()) + ", aluguel " + aquisicao.getAluguel());
           }
        }
    } 
}
