package casas;

public abstract class Casa {
    protected String nome;
    protected int posicao = 0;

    public Casa(String nome, int posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public abstract String getTipo();
    // Ajustar para alguma forma fazer executar uma ação
    // public abstract void executarAcao();
}