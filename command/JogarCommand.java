package command;
import java.util.Random;

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
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int movimento = dado1 + dado2;
        System.out.println("O jogador " + jogador.getNome() + " tirou " + dado1 + "," + dado2 + " e avançou " + movimento + " Casas.");
        
        jogador.movimentar(movimento, tabuleiro);
    }
}
