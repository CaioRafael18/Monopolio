package command;
import java.util.Scanner;

import jogo.Jogador;
import jogo.Jogo;
import jogo.Tabuleiro;

public class SairCommand implements Command{
    @Override
    public void executar(Jogador jogador, Tabuleiro tabuleiro, Jogo jogo) {
        if (confirmarSaida(jogo.getScanner())) {
            jogo.getJogadores().remove(jogador);
            if (jogo.getJogadores().size() == 1) {
                System.out.println("O jogador " + jogo.getJogadores().get(0).getNome() + " venceu o jogo!");
                jogo.terminarJogo();
            }
        }
    }

    private boolean confirmarSaida(Scanner scanner){
        System.out.println("Você tem certeza de que quer sair (Sim/Não)? ");
        String confirmacao = scanner.nextLine().toLowerCase();
        return confirmacao.equals("sim");
    }
}
