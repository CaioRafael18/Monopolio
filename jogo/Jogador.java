package jogo;
import java.util.*;

import casas.Casa;

public class Jogador {
    private String nome;
    private String cor;
    private int saldo;
    private int posicao;
    private List<Casa> propriedades;

    public Jogador(String nome, String cor){
        this.cor = cor;
        this.nome = nome;
        this.saldo = 1500;
        this.posicao = 0;
        this.propriedades = new ArrayList<>();
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

    public List<Casa> getPropriedades(){
        return propriedades;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public void movimentar(int movimento, Tabuleiro tabuleiro){
        int novaPosicao = (posicao + movimento);
        setPosicao(novaPosicao);
        Casa casaAtual = tabuleiro.getCasa(novaPosicao);
        System.out.println("O peão de " + nome + " Caiu em " + casaAtual.getNome() + ".");
        System.out.println("------------------------------------------------------------");
    }
}

