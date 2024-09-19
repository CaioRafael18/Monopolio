package casas.init;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import casas.Casa;
import casas.repository.CasaRepository;
import casas.tipos.Ferrovia;

public class FerroviasInit extends CasaRepository {
    public static ArrayList<Casa> initFerrovias(String caminho, ArrayList<Casa> casas) {
        try (BufferedReader reader = lerCsv(caminho)) {
            String linha = reader.readLine();
            while ((linha = reader.readLine()) != null) {
                String[] valores = linha.split(",");
                if (valores.length >= 11) {
                    try {
                        int posicao = Integer.parseInt(valores[0].trim());
                        String nome = valores[1].trim();
                        int preco = Integer.parseInt(valores[2].trim());
                        int hipoteca = Integer.parseInt(valores[9].trim());
                        Ferrovia ferrovia = new Ferrovia(nome, posicao, preco, hipoteca);
                        casas.set(posicao-1, ferrovia);
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
