package casas.tipos;

import casas.Casa;
import casas.TipoImposto;
import jogo.Jogador;

public class Imposto extends Casa {
    private TipoImposto imposto;

    public Imposto(String nome, int posicao, TipoImposto imposto) {
        super(nome, posicao);
        this.imposto = imposto;
    }

    @Override
    public String getTipo() {
        return "Imposto";
    }

    @Override
    public void venderCasa(Jogador jogadorComprador) {}

    @Override
    public void ofertarVendaCasa(Jogador jogador) {}

    @Override
    public void executarAcao(Jogador jogador) {
        System.out.println("Você caiu no imposto " + imposto.getNome() + ". Terá que pagar R$" + imposto.getValor() + " ao banco");
        jogador.retirarSaldo(imposto.getValor());
    }
}
