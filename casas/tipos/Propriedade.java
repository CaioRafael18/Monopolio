package casas.tipos;

import java.util.Scanner;

import casas.Casa;
import jogo.Jogador;

public class Propriedade extends Casa {
    private String corGrupo;
    private int preco;
    private int[] alugueis;
    private int hipoteca;
    private int precoCasa;
    private int casas;
    
    public Propriedade(String nome, int posicao, int preco, int[] alugueis, int hipoteca, int precoCasa, String corGrupo) {
        super(nome, posicao);
        this.preco = preco;
        this.alugueis = alugueis;
        this.hipoteca = hipoteca;
        this.precoCasa = precoCasa;
        this.corGrupo = corGrupo;
    }

    public int getPreco(){
        return preco;
    }

    public int getHipoteca(){
        return hipoteca;
    }

    public int getPrecoCasa(){
        return precoCasa;
    }

    public String getCorGrupo(){
        return corGrupo;
    }

    public int getAluguel(){
        return this.alugueis[this.casas];
    }

    public void addCasas() {
        this.casas += 1;
    }

    public void ofertarVenderCasa(Jogador jogador){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Essa propriedade é sua, deseja comprar um imovel ? (s/n)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s") && jogador.podeComprarImovel((Propriedade) this)){
                jogador.adicionarCasa((Propriedade) this);
            }
        }
    }

    @Override
    public void ofertarVendaCasa(Jogador jogador) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("A título da " + getTipo() + " " + getNome() + " está disponível por $140");
            System.out.println(jogador.getNome() + ", você possui $" + jogador.getSaldo());
            System.out.println(jogador.getNome() + ", você possui $" + jogador.getSaldo());
            System.out.println("Você deseja comprar " + getNome() + " (s/n)");
            String resposta = scanner.nextLine().toLowerCase();
            if (resposta.equalsIgnoreCase("s")){
                venderCasa(jogador);
            }
        }
    }

    @Override
    public void venderCasa(Jogador jogadorComprador) {
        jogadorComprador.comprarCasa(this);
    }

    @Override
    public String getTipo() {
        return "Propriedade";
    }

    @Override
    public void executarAcao(Jogador jogador) {
        if(this.getProprietario() == null && jogador.podeComprarCasa(this)) {
            this.ofertarVendaCasa(jogador);
        } else if(this.getProprietario() == jogador){
            this.ofertarVenderCasa(jogador);
        } else if(this.getProprietario() != null && this.getProprietario() != jogador) {
            jogador.pagarAluguelPropriedade((Propriedade) this);
        }
    }    
}
