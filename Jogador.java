public class Jogador {
    private String nome;
    private String cor;

    public Jogador(String nome, String cor){
        this.cor = cor;
        this.nome = nome;
    } 

    public String getNome(){
        return nome;
    }

    public String getCor(){
        return cor;
    }
}
