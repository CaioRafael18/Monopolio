package jogo;
import java.util.*;

import Movimentos.MovimentoStrategy;
import casas.Casa;

public class Jogador {
    private String nome;
    private String cor;
    private int saldo;
    private int posicao;
    private List<Casa> propriedades;
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

    public List<Casa> getPropriedades(){
        return propriedades;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
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

