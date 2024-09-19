package casas.init;

import java.util.ArrayList;

import casas.Casa;
import casas.pontos.PontoParadaLivre;
import casas.pontos.PontoPartida;
import casas.pontos.Prisao;

public class PontoInit {
    public static void iniciarPontos(ArrayList<Casa> casas){
        PontoParadaLivre paradaLivre = new PontoParadaLivre("Free Parking", 20);
        PontoPartida pontoPartida = new PontoPartida("go", 40);
        Prisao visitaPrisao = new Prisao("Jail – Just Visiting", 10);
        Prisao vaiPrisao = new Prisao("Go to Jail", 30);
        casas.set(20-1, paradaLivre);
        casas.set(40-1, pontoPartida);
        casas.set(10-1, visitaPrisao);
        casas.add(30-1, vaiPrisao);
    }
}
