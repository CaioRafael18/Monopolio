import java.util.*;

public class Jogo {
    private List<Jogador> jogadores;
    private Scanner scanner;

    public Jogo(){
        jogadores = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciarJogo(){
        System.out.println("Entre com o número de jogadores [2-8]: \n");
        int numeroJogadores = scanner.nextInt();
        scanner.nextLine();

        while(numeroJogadores < 2){
            System.out.println("Numero de jogadores invalido!");
            numeroJogadores = scanner.nextInt();
            scanner.nextLine();
        }

        List<String> cores = new ArrayList<>(Arrays.asList("preto","branco","vermelho","verde","azul","amarelo","laranja","rosa"));

        for(int i = 1; i <= numeroJogadores; i++){
            System.out.println("Entre com o nome do jogador no. " + i + ": ");
            String nome = scanner.nextLine();

            System.out.println("Escolha a cor do peão do jogador no. " + i + " Entre as opções abaixo:");
            for(String cor : cores){
                System.out.println("[" + cor + "]");
            }
            System.out.println();
            
            String corEscolhida = scanner.nextLine().toLowerCase();
            while(!cores.contains(corEscolhida)){
                System.out.println("Cor Indisponivel! Digite novamente: ");
                corEscolhida = scanner.nextLine().toLowerCase();
            }
            cores.remove(corEscolhida);
            jogadores.add(new Jogador(nome, corEscolhida));
        }
        System.out.println("O jogo Monopoly foi iniciado.");
        Jogador primeiroJogador = jogadores.get(0);
        System.out.println("A jogada de " + primeiroJogador.getNome() + " começou.");
        System.out.println("Comandos disponíveis: [jogar][sair]");
        System.out.print("Entre com um comando: ");
    }

}
