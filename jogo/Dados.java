package jogo;

import java.util.Random;

public class Dados {
    Random random = new Random();
    int dado1;
    int dado2;
    int movimento;
    
    public Dados(){}

    public int[] jogarDados(){
        this.dado1 = random.nextInt(6)+1;
        this.dado2 = random.nextInt(6)+1;
        this.movimento = dado1+dado2;
        return new int[] {dado1, dado2, movimento};
    }

    public int getDado1() {
        return this.dado1;
    }
    
    public int getDado2() {
        return this.dado2;
    }

    public int getMovimento() {
        return this.movimento;
    }
}
