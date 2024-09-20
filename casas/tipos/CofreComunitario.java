package casas.tipos;

import casas.Casa;
import jogo.Jogador;

public class CofreComunitario extends Casa {
    public CofreComunitario(String nome, int posicao) {
        super(nome, posicao);
    }

    @Override
    public String getTipo() {
        return "Cofre";
    }

    @Override
    public void venderCasa(Jogador jogadorComprador) {}

    @Override
    public void ofertarVendaCasa(Jogador jogador) {}

    @Override
    public void executarAcao(Jogador jogador) {
        System.out.println("Você caiu no cofre! Por enquanto não está implementado! 😥");
    }
}