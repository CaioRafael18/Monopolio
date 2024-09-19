package casas.init;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import casas.Casa;
import casas.repository.CasaRepository;
import casas.tipos.SorteReves;

public class SorteRevesInit extends CasaRepository {
    public static ArrayList<Casa> initSorteReves(String caminho, ArrayList<Casa> casas) {
        try (BufferedReader reader = lerCsv(caminho)) {
            String linha = reader.readLine();
            while ((linha = reader.readLine()) != null) {
                String[] valores = linha.split(",");
                if (valores.length >= 11) {
                    try {
                        int posicao = Integer.parseInt(valores[0].trim());
                        String nome = valores[1].trim();
                        SorteReves sorteReves = new SorteReves(nome, posicao);
                        casas.set(posicao-1, sorteReves);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 

        return casas;
    }
}
