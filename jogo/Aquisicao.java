package jogo;

public class Aquisicao {
    private int preco;
    private int hipoteca;
    private String nome;
    private String tipoPropriedade;
    private String corGrupo;
    private int aluguel;

    public Aquisicao(int preco, int hipoteca, String nome, String tipoPropriedade, String corGrupo, int aluguel) {
        this.preco = preco;
        this.hipoteca = hipoteca;
        this.nome = nome;
        this.tipoPropriedade = tipoPropriedade;
        this.corGrupo = corGrupo;
        this.aluguel = aluguel;
    }

    public int getPreco() {
        return preco;
    }

    public int getHipoteca() {
        return hipoteca;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getValorEspecifico() {
        return preco;
    }

    public String getNome(){
        return nome;
    }

    public String getTipoPropriedade(){
        return tipoPropriedade;
    }

    public String getCorGrupo(){
        return corGrupo;
    }

    public int getAluguel(){
        return aluguel;
    }
}
