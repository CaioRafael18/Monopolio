package casas.tipos;

import java.util.ArrayList;
import java.util.Random;

import cartas.Carta;
import casas.Casa;
import jogo.Jogador;
import jogo.Tabuleiro;

public class SorteReves extends Casa {
    Random random = new Random();
    private int indiceCarta;
    private Tabuleiro tabuleiro;

    public SorteReves(String nome, int posicao, Tabuleiro tabuleiro) {
        super(nome, posicao);
        this.tabuleiro = tabuleiro;
    }

    public void randomIndiceCarta() {
        this.indiceCarta = random.nextInt((this.tabuleiro.getCartasSorteReves().size())-1);
    }

    public Carta pegarCarta(ArrayList<Carta> cartasSorteRevez) {     
        randomIndiceCarta();
        
        Carta cartaVez = cartasSorteRevez.get(this.indiceCarta);
        cartasSorteRevez.remove(this.indiceCarta);

        return cartaVez;
    }

    @Override
    public String getTipo() {
        return "Sorte/Reves";
    }

    @Override
    public void venderCasa(Jogador jogadorComprador) {}

    @Override
    public void ofertarVendaCasa(Jogador jogador) {}

    @Override
    public void executarAcao(Jogador jogador) {
        Carta carta = pegarCarta(tabuleiro.getCartasSorteReves());
        carta.executarAcao(jogador);
    }
}