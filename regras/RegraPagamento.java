package regras;

import jogo.Jogador;

public enum RegraPagamento {
    RECEBER {
        public void executarRegra(Jogador jogador, int valor) {
            jogador.adicionarSaldo(valor);
        }
    },
    PAGAR {
      public void executarRegra(Jogador jogador, int valor) {
          jogador.retirarSaldo(valor);
      }
    };

    public abstract void executarRegra(Jogador jogador, int valor);
}
