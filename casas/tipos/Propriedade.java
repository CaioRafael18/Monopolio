package casas.tipos;

import casas.Casa;

public class Propriedade extends Casa{
    private String corGrupo;
    private int preco;
    private int aluguelSemCasa;
    private int aluguelCasa1;
    private int aluguelCasa2;
    private int aluguelCasa3;
    private int aluguelCasa4;
    private int hotel;
    private int hipoteca;
    private int precoCasa;

    public Propriedade(String nome, int posicao, int preco, int aluguelSemCasa, int aluguelCasa1, int aluguelCasa2, int aluguelCasa3, int aluguelCasa4, int hotel, int hipoteca, int precoCasa, String corGrupo) {
        super(nome, posicao);
        this.preco = preco;
        this.aluguelSemCasa = aluguelSemCasa;
        this.aluguelCasa1 = aluguelCasa1;
        this.aluguelCasa2 = aluguelCasa2;
        this.aluguelCasa3 = aluguelCasa3;
        this.aluguelCasa4 = aluguelCasa4;
        this.hotel = hotel;
        this.hipoteca = hipoteca;
        this.precoCasa = precoCasa;
        this.corGrupo = corGrupo;
    }

    @Override
    public String getTipo() {
        return "Propriedade";
    }

    public int getPreco(){
        return preco;
    }

    public int getAluguelSemCasa(){
        return aluguelSemCasa;
    }

    public int getAluguelCasa1(){
        return aluguelCasa1;
    }

    public int getAluguelCasa2(){
        return aluguelCasa2;
    }
    
    public int getAluguelCasa3(){
        return aluguelCasa3;
    }

    public int getAluguelCasa4(){
        return aluguelCasa4;
    }
    
    public int getHotel(){
        return hotel;
    }

    public int getHipoteca(){
        return hipoteca;
    }

    public int getPrecoCasa(){
        return precoCasa;
    }

    public String getCorGrupo(){
        return corGrupo;
    }

    @Override
    public void executarAcao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executarAcao'");
    }
   
}
