package casas.tipos;

import java.util.Scanner;

import casas.Casa;
import jogo.Jogador;

public class ServicoPublico extends Casa {
    int preco;
    int hipoteca;

    public ServicoPublico(String nome, int posicao, int valor, int hipoteca) {
        super(nome, posicao);
        this.preco = valor;
        this.hipoteca = hipoteca;
    }

    public int getPreco() {
        return preco;
    }
    
    public int getHipoteca() {
        return hipoteca;
    }

    @Override
    public String getTipo() {
        return "Servico Publico";
    }

    @Override
    public void venderCasa(Jogador jogadorComprador) {
        jogadorComprador.comprarServicoPublico(this);

    }

    @Override
    public void ofertarVendaCasa(Jogador jogador) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Serviço publico " + getNome() + " esta disponivel por " + getPreco());
            System.out.println("Deseja comprar? (s/n)");
            String resposta = scanner.nextLine();
            if(resposta.equalsIgnoreCase("s")){
                venderCasa(jogador);
            }
        }
    }

    @Override
    public void executarAcao(Jogador jogador) {
        if (this.getProprietario() == null){
            ofertarVendaCasa(jogador);
        } else {
            int movimento = jogador.getDados().getMovimento();
            System.out.println("Você pagará o valor (aluguel x soma dos numeros do dado)");
            System.out.println("Aluguel: " + getPreco());
            System.out.println("Numero do dado: " + movimento);
            System.out.println("Você pagará " + (getPreco() * movimento) + " à " + this.getProprietario().getNome());
            jogador.pagarAluguelServicoPublico(this);
        }
    }
}
