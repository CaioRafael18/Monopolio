package cartas;

import jogo.Jogador;

public class CartaSorteReves extends Carta {
    private TipoPagamentoCartaSorteReves tipoPagamentos;
    private int valor;

    public CartaSorteReves(int numero, String nome, String descricao, TipoPagamentoCartaSorteReves tipoPagamentos, int valor) {
        super(numero, nome, descricao);
        this.tipoPagamentos = tipoPagamentos;
        this.valor = valor;
    }

    @Override
    public void executarAcao(Jogador jogador) {
        System.out.println(super.getNome() + " - " + super.getDescricao());
        tipoPagamentos.executarRegra(jogador, valor);
    }
    
}
