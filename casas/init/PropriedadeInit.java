package casas.init;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import casas.Casa;
import casas.repository.CasaRepository;
import casas.tipos.Propriedade;

public class PropriedadeInit extends CasaRepository {
    public static ArrayList<Casa> iniciarPropriedade(String caminho, ArrayList<Casa> casas) {
        try (BufferedReader reader = lerCsv(caminho)) {
            String linha = reader.readLine();
            while ((linha = reader.readLine()) != null) {
                String[] valores = linha.split(",");
                if (valores.length >= 11) {
                    try {
                        int posicao = Integer.parseInt(valores[0].trim());
                        String nome = valores[1].trim();
                        int preco = Integer.parseInt(valores[2].trim());
                        int[] alugueis = {
                            Integer.parseInt(valores[3].trim()),
                            Integer.parseInt(valores[4].trim()),
                            Integer.parseInt(valores[5].trim()),
                            Integer.parseInt(valores[6].trim()),
                            Integer.parseInt(valores[7].trim()),
                            Integer.parseInt(valores[8].trim())
                        };
                        int hipoteca = Integer.parseInt(valores[9].trim());
                        int precoCasa = Integer.parseInt(valores[10].trim());
                        String corGrupo = valores[11].trim();
                            
                        Propriedade propriedade = new Propriedade(nome, posicao, preco, alugueis, hipoteca, precoCasa, corGrupo);
                        casas.set(posicao-1, propriedade);
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
