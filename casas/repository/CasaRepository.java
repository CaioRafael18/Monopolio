package casas.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import casas.Casa;
import casas.init.CofreInit;
import casas.init.FerroviasInit;
import casas.init.ImpostoInit;
import casas.init.PontoInit;
import casas.init.PropriedadeInit;
import casas.init.ServicoPublicoInit;
import casas.init.SorteRevesInit;
import jogo.Tabuleiro;

public class CasaRepository {
    public static BufferedReader lerCsv(String caminho) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(caminho));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reader;
    }

    public static ArrayList<Casa> criarCasas(Tabuleiro tabuleiro) {
        ArrayList<Casa> casas = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            casas.add(null);
        }
        PropriedadeInit.iniciarPropriedade("./csvData/propriedade.csv", casas);
        CofreInit.initCofres("./csvData/cofres_comunitario.csv", casas);
        FerroviasInit.initFerrovias("./csvData/ferrovias.csv", casas);
        ServicoPublicoInit.initServicoPublico("./csvData/servico_publico.csv", casas);
        SorteRevesInit.initSorteReves("./csvData/sorte_reves.csv", casas, tabuleiro);
        PontoInit.iniciarPontos(casas);
        ImpostoInit.initImposto(casas);
        return casas;
    };
}
