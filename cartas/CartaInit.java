package cartas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CartaInit {
    public static ArrayList<Carta> CartasSorteRevesInit(String caminho, ArrayList<Carta> cartas){
        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha = reader.readLine();
            while ((linha = reader.readLine()) != null) {
                String[] colunas = linha.split(",");
                try {
                    int numero = Integer.parseInt(colunas[0].trim());
                    String nome = colunas[1].trim();
                    String descricao = colunas[2].trim();
    
                    if (colunas.length > 4) {
                        TipoPagamentoCartaSorteReves tipoPagamentos = TipoPagamentoCartaSorteReves.valueOf(colunas[3].trim());
                        int valor = Integer.parseInt(colunas[4].trim());
                        CartaSorteReves pagamento = new CartaSorteReves(numero, nome, descricao, tipoPagamentos, valor);
                        cartas.add(pagamento);
                    }  
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro ao processar a linha: " + linha + ". " + e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cartas;
    }
}
