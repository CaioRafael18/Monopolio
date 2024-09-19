package casas.init;

import java.util.ArrayList;

import casas.Casa;
import casas.pontos.PontoParadaLivre;
import casas.pontos.PontoPartida;
import casas.pontos.Prisao;

public class PontoInit {
    public static void iniciarPontos(ArrayList<Casa> lugares){
        PontoParadaLivre paradaLivre = new PontoParadaLivre("Free Parking", 20);
        PontoPartida pontoPartida = new PontoPartida("go", 40);
        Prisao prisao = new Prisao("Jail – Just Visiting", 10);
        // VaiParaPrisao vaiParaPrisao = new VaiParaPrisao("Go to Jail", 30);
        lugares.add(paradaLivre);
        lugares.add(pontoPartida);
        lugares.add(prisao);
        // lugares.add(vaiParaPrisao);
    }
}
