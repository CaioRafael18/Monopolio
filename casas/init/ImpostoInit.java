package casas.init;

import java.util.ArrayList;

import casas.Casa;
import casas.TipoImposto;
import casas.repository.CasaRepository;
import casas.tipos.Imposto;

public class ImpostoInit extends CasaRepository {
    public static void initImposto(ArrayList<Casa> casas){
        TipoImposto tipoRenda = TipoImposto.RENDA;
        TipoImposto tipoRiqueza = TipoImposto.RIQUEZA;
        Imposto impostoRenda = new Imposto("income tax", 4, tipoRenda);
        Imposto impostoRiqueza = new Imposto("luxury tax", 38, tipoRiqueza);
        casas.set(4-1, impostoRenda);
        casas.set(38-1, impostoRiqueza);
    }
}
