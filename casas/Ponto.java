package casas;

public class Ponto extends Casa {
    public Ponto(String nome, int posicao) {
        super(nome, posicao);
    }

    @Override
    public String getTipo() {
        return "Ponto";
    }
}
