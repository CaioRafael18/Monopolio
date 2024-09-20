package jogo;
import java.util.*;

import Movimentos.MovimentoStrategy;
import casas.tipos.Propriedade;
import jogo.aquisicoes.AquisicaoPropriedade;

public class Jogador {
    private String nome;
    private String cor;
    private int saldo;
    private int posicao;
    private List<AquisicaoPropriedade> propriedades;
    private boolean estaNaPrisao;
    private int numeroTentativas;
    private MovimentoStrategy movimentoStrategy;

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
            saldo -= 50;
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

    public List<AquisicaoPropriedade> getPropriedades(){
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
        retirarSaldo(casa.getPreco());
        System.out.println(getNome()+ " comprou a " + casa.getTipo() + " " + casa.getNome() + "!!!");
    }

    public boolean podeComprarCasa(Propriedade propriedade){
       if(this.saldo>=propriedade.getPreco()){
        propriedades.add(new AquisicaoPropriedade(propriedade));
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

    public void setEstaNaPrisao(boolean estaNaPrisao){
        this.estaNaPrisao = estaNaPrisao;
    }

    public void movimentar(int movimento, Tabuleiro tabuleiro) {
        if (movimentoStrategy != null) {
            movimentoStrategy.executarMovimento(this, tabuleiro, movimento);
        } 
    }
}

