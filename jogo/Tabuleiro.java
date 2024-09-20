package jogo;
import java.util.*;

import casas.Casa;
// import TiposDeCasas.Cofre;
// import TiposDeCasas.Ferrovia;
// import TiposDeCasas.Imposto;
// import TiposDeCasas.ParadaLivre;
// import TiposDeCasas.Partida;
// import TiposDeCasas.Prisao;
// import TiposDeCasas.Propriedade;
// import TiposDeCasas.ServicoPublico;
// import TiposDeCasas.SorteReves;
import casas.repository.CasaRepository;

public class Tabuleiro {
    private List<Casa> casas;
    
    public Tabuleiro(){
        this.casas = new ArrayList<>();
        this.inicializarTabuleiro();

        // casas = new ArrayList<>();

        // casas.add(new Propriedade("Mediterranean Avenue", 1, 60, 2, 10, 30, 90, 160, 250, 30, 50, "Marrom"));

        // casas.add(new Cofre("Community Chest 1", 2));

        // casas.add(new Propriedade("Baltic Avenue", 3, 60, 4, 20, 60, 180, 320, 450, 30, 50, "Marrom"));

        // casas.add(new Imposto("Income Tax", 4, 200));

        // casas.add(new Ferrovia("Reading Railroad", 5, 200, 25, 50, 100, 200, 100));

        // casas.add(new Propriedade("Oriental Avenue", 6, 100, 6, 30, 90, 270, 400, 550, 50, 50, "Azul Claro"));

        // casas.add(new SorteReves("Chance 1", 7));

        // casas.add(new Propriedade("Vermont Avenue", 8, 100, 6, 30, 90, 270, 400, 550, 50, 50, "Azul Claro"));

        // casas.add(new Propriedade("Connecticut Avenue", 9, 120, 8, 40, 100, 300, 450, 600, 60, 50, "Azul Claro"));

        // casas.add(new Prisao("Jail/Just Visiting", 10));

        // casas.add(new Propriedade("St. Charles Place", 11, 140, 10, 50, 150, 450, 625, 750, 70, 100, "Rosa"));

        // casas.add(new ServicoPublico("Electric Company",12, 150, 75));

        // casas.add(new Propriedade("States Avenue",13, 140, 10, 50, 150, 450, 625, 750, 70, 100, "Rosa"));

        // casas.add(new Propriedade("Virginia Avenue", 14, 160, 12, 60, 180, 500, 700, 900, 80, 100, "Rosa"));

        // casas.add(new Ferrovia("Pennsylvania Railroad", 15, 200, 25, 50, 100, 200, 100));

        // casas.add(new Propriedade("St. James Place", 16, 180, 14, 70, 200, 550, 750, 950, 90, 100, "Laranja"));

        // casas.add(new Cofre("Community Chest 2", 17));

        // casas.add(new Propriedade("Tennessee Avenue",18, 180, 14, 70, 200, 550, 750, 950, 90, 100, "Laranja"));

        // casas.add(new Propriedade("New York Avenue", 19, 200, 16, 80, 220, 600, 800, 1000, 100, 100, "Laranja"));

        // casas.add(new ParadaLivre("Free Parking", 20));

        // casas.add(new Propriedade("Kentucky Avenue", 21, 220, 18, 90, 250, 700, 875, 1050, 110, 150, "Vermelho"));

        // casas.add(new SorteReves("Chance 2", 22));

        // casas.add(new Propriedade("Indiana Avenue", 23, 220, 18, 90, 250, 700, 875, 1050, 110, 150, "Vermelho"));

        // casas.add(new Propriedade("Illinois Avenue", 24, 240, 20, 100, 300, 750, 925, 1100, 120, 150, "Vermelho"));

        // casas.add(new Ferrovia("B&O Railroad", 25, 200, 25, 50, 100, 200, 100));

        // casas.add(new Propriedade("Atlantic Avenue", 26, 260, 22, 110, 330, 800, 975, 1150, 130, 150, "Amarelo"));

        // casas.add(new Propriedade("Ventnor Avenue",27, 260, 22, 110, 330, 800, 975, 1150, 130, 150, "Amarelo"));

        // casas.add(new ServicoPublico("Water Works", 28, 150, 75));

        // casas.add(new Propriedade("Marvin Gardens", 29, 280, 24, 120, 360, 850, 1025, 1200, 140, 150, "Amarelo"));

        // casas.add(new Prisao("Go to Jail", 30));

        // casas.add(new Propriedade("Pacific Avenue", 31, 300, 26, 130, 390, 900, 1100, 1275, 150, 200, "Verde"));

        // casas.add(new Propriedade("North Carolina Avenue", 32, 300, 26, 130, 390, 900, 1100, 1275, 150, 200, "Verde"));

        // casas.add(new Cofre("Community Chest 3", 33));

        // casas.add(new Propriedade("Pennsylvania Avenue", 34, 320, 28, 150, 450, 1000, 1200, 1400, 160, 200, "Verde"));

        // casas.add(new Ferrovia("Short Line Railroad", 35, 200, 25, 50, 100, 200, 100));

        // casas.add(new SorteReves("Chance 3",36));

        // casas.add(new Propriedade("Park Place", 37, 350, 35, 175, 500, 1100, 1300, 1500, 175, 200, "Azul Escuro"));

        // casas.add(new Imposto("Luxury Tax", 38, 100));

        // casas.add(new Propriedade("Boardwalk", 39, 400, 50, 200, 600, 1400, 1700, 2000, 200, 200, "Azul Escuro"));

        // casas.add(new Partida("Go", 40));

       
    }   

    public int getQuantidadeCasas(){
        return casas.size();
    }
    
    private void inicializarTabuleiro() {
        this.casas = CasaRepository.criarCasas();
    }

    public Casa getCasa(int posicao){
        if (posicao > 0 && posicao <= casas.size()) {
            return casas.get(posicao - 1); 
        } else {
            return casas.get(0); 
        }
    }
}
