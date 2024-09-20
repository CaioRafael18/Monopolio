package casas.tipos;

import java.util.Scanner;

import casas.Casa;
import jogo.Jogador;

public class Ferrovia extends Casa {
    int preco;
    int hipoteca;
    
    public Ferrovia(String nome, int posicao, int preco, int hipoteca) {
        super(nome, posicao);
        this.preco = preco;
        this.hipoteca = hipoteca;
    }

    public int getPreco(){
        return preco;
    }

    public int getHipoteca(){
        return preco;
    }

    @Override
    public String getTipo() {
        return "Ferrovia";
    }

    @Override
    public void venderCasa(Jogador jogadorComprador) {
        jogadorComprador.comprarFerrovia(this);
    }

    @Override
    public void ofertarVendaCasa(Jogador jogador) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("A título da " + getTipo() + " " + getNome() + " está disponível por $140");
            System.out.println(jogador.getNome() + " possui $" + jogador.getSaldo());
            System.out.println("Você deseja comprar " + getNome() + " (s/n)");
            String resposta = scanner.nextLine().toLowerCase();
            if (resposta.equalsIgnoreCase("s")){
                venderCasa(jogador);
            }
        }
    }

    @Override
    public void executarAcao(Jogador jogador) {
        if(this.getProprietario() != null) {
            System.out.println("Está ferrovia tem proprietário.");
            int taxa = 25;
            this.getProprietario().adicionarSaldo(taxa);
            System.out.printf("Você teve que pagar uma taxa de %d para %s.\n", taxa, this.getProprietario().getNome());
        } else {
            ofertarVendaCasa(jogador);
        }
    }
}
