package jogo;
import java.util.*;

import command.Command;
import command.JogarCommand;
import command.PagarCommand;
import command.SairCommand;
import command.StatusCommand;

public class Jogo {
    private List<Jogador> jogadores;
    private Tabuleiro tabuleiro;
    private Scanner scanner;
    private int jogadorAtual;
    private Map<String, Command> comandos;
    private boolean jogoEmAndamento;


    public Jogo(){
        jogadores = new ArrayList<>();
        tabuleiro = new Tabuleiro();
        scanner = new Scanner(System.in);
        comandos = new HashMap<>();
        jogadorAtual = 0;
        jogoEmAndamento = true;

        comandos.put("jogar", new JogarCommand());
        comandos.put("status", new StatusCommand());
        comandos.put("sair", new SairCommand());
        comandos.put("pagar", new PagarCommand());
    }

    public void iniciarJogo(){
        System.out.println("Entre com o número de jogadores [2-8]: \n");
        int numeroJogadores = scanner.nextInt();
        scanner.nextLine();

        while(numeroJogadores < 2 || numeroJogadores > 8){
            System.out.println("Numero de jogadores inválido!");
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
        System.out.println("------------------------------------------------------------");
        System.out.println("O jogo Monopoly foi iniciado.");
        altenarJogadores();
    }
    
    private void altenarJogadores(){
        while(jogadores.size() > 1 && jogoEmAndamento){
            Jogador jogador = jogadores.get(jogadorAtual);
            System.out.println("------------------------------------------------------------");
            System.out.println("A jogada de " + jogador.getNome() + " começou.");

            if (jogador.estaNaPrisao()){
                lidarComPrisioneiro(jogador);
            } else{ 
                System.out.println("Comandos disponíveis: [jogar][status][sair]");
                retornoComando(jogador);
            }
        }
    }

    private void lidarComPrisioneiro(Jogador jogador){
        System.out.println(jogador.getNome() + " está na prisão.");
        System.out.println("Comandos disponíveis: [pagar][carta][jogar][status][sair]");
        retornoComando(jogador);
    }

    private void retornoComando(Jogador jogador){
        System.out.print("Entre com um comando: ");
        String comando = scanner.nextLine().toLowerCase();
        Command executarComando = comandos.get(comando);
        verificaComandoValido(executarComando, jogador);
    }

    public void verificaComandoValido(Command executarComando, Jogador jogador){
        if (executarComando != null) {
            executarComando.executar(jogador, tabuleiro, this);
        } else{
            System.out.println("Comando inválido!");
        }
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public int getJogadorAtual() {
        return jogadorAtual;
    }

    public void setJogadorAtual(int jogadorAtual) {
        this.jogadorAtual = jogadorAtual;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void terminarJogo() {
        jogoEmAndamento = false;
    }
}
