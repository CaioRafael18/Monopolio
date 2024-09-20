package cartas;

import jogo.Jogador;

public enum TipoPagamentoCartaSorteReves {
    RECEBA {
        public void executarRegra(Jogador jogador, int valor) {
            jogador.adicionarSaldo(valor);
        }
    },
    PAGUE {
      public void executarRegra(Jogador jogador, int valor) {
          jogador.retirarSaldo(valor);
      }
    };

    public abstract void executarRegra(Jogador jogador, int valor);
}
