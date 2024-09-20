package jogo;
import java.util.*;

import Movimentos.MovimentoStrategy;
import casas.tipos.Ferrovia;
import casas.tipos.Propriedade;
import casas.tipos.ServicoPublico;
import jogo.aquisicoes.AquisicaoFerrovia;
import jogo.aquisicoes.AquisicaoPropriedade;
import jogo.aquisicoes.AquisicaoServicoPublico;

public class Jogador {
    private String nome;
    private String cor;
    private int saldo;
    private int posicao;
    private List<Aquisicao> propriedades;
    private boolean estaNaPrisao;
    private int numeroTentativas;
    private MovimentoStrategy movimentoStrategy;
    private Dados dados;

    public Jogador(String nome, String cor){
        this.cor = cor;
        this.nome = nome;
        this.saldo = 1500;
        this.posicao = 0;
        this.numeroTentativas = 0;
        this.propriedades = new ArrayList<>();
    } 

    public void setMovimentoStrategy(MovimentoStrategy movimentoStrategy) {
        this.movimentoStrategy = movimentoStrategy;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    public Dados getDados() {
        return this.dados;
    }

    public String getNome(){
        return nome;
    }

    public String getCor(){
        return cor;
    }

    public int getSaldo(){
        return saldo;
    }

    public int getPosicao(){
        return posicao;
    }

    public int getNumeroTentativas(){
        return numeroTentativas;
    }

    public void pagar(){
        if (saldo >= 50) {
            this.retirarSaldo(50);
            estaNaPrisao = false;
            numeroTentativas = 0; 
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void incrementaTentativas(){
        numeroTentativas++;
    }

    public boolean estaNaPrisao() {
        return estaNaPrisao;
    }

    public List<Aquisicao> getPropriedades(){
        return propriedades;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public void adicionarSaldo(int valor) {
        this.saldo += valor;
    }

    public void retirarSaldo(int valor) {
        this.saldo -= valor;
    }

    public void comprarCasa(Propriedade casa){
        casa.setProprietario(this);
        propriedades.add(new AquisicaoPropriedade(casa));
        retirarSaldo(casa.getPreco());
        System.out.println(getNome() + " comprou a " + casa.getTipo() + " " + casa.getNome() + "!!!");
    }

    public void comprarFerrovia(Ferrovia casa) {
        retirarSaldo(casa.getPreco());
        propriedades.add(new AquisicaoFerrovia(casa));
        System.out.println(getNome() + " comprou a " + casa.getTipo() + " " + casa.getNome() + "!!!");
    }

    public void comprarServicoPublico(ServicoPublico casa){
        retirarSaldo(casa.getPreco());
        propriedades.add(new AquisicaoServicoPublico(casa));
        casa.setProprietario(this);
        System.out.println(getNome() + " comprou o " + casa.getTipo() + " " + casa.getNome() + "!!!");
    }

    public boolean podeComprarCasa(Propriedade casa){
       if(this.saldo>=casa.getPreco()){
           return true;
       }
       return false;
    }

    public boolean podeComprarImovel(Propriedade casa){
        if(this.saldo>=casa.getPrecoCasa() && this.getPropriedades().size()<5){
            return true;
        }
        return false;
    };

    public void adicionarCasa(Propriedade casa){
        casa.addCasas();
        this.saldo -= casa.getPrecoCasa();
    }

    public void pagarAluguelPropriedade(Propriedade casa){
        retirarSaldo(casa.getAluguel());
        casa.getProprietario().adicionarSaldo(casa.getAluguel());
    }

    public void pagarAluguelServicoPublico(ServicoPublico casa){
        this.retirarSaldo(casa.getPreco());
        casa.getProprietario().adicionarSaldo(casa.getPreco());
    }

    public void setEstaNaPrisao(boolean estaNaPrisao){
        this.estaNaPrisao = estaNaPrisao;
    }

    public void movimentar(int movimento, Tabuleiro tabuleiro) {
        if (movimentoStrategy != null) {
            movimentoStrategy.executarMovimento(this, tabuleiro, movimento);
        } 
    }
}

