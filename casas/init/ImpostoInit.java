package casas.init;

import java.util.ArrayList;

import casas.Casa;
import casas.TipoImposto;
import casas.repository.CasaRepository;
import casas.tipos.Imposto;

public class ImpostoInit extends CasaRepository {
    public static void initImposto(ArrayList<Casa> lugares){
        TipoImposto tipoRenda = TipoImposto.RENDA;
        TipoImposto tipoRiqueza = TipoImposto.RIQUEZA;
        Imposto impostoRenda = new Imposto("income tax", 4, tipoRenda);
        Imposto impostoRiqueza = new Imposto("luxury tax", 38, tipoRiqueza);
        lugares.set(4, impostoRenda);
        lugares.set(38, impostoRiqueza);
    }
}
