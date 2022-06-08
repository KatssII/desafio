package _5_24_exercicio_interface_e_polimorfismo;

public class Carro implements Seguravel {

    private int valor;
    private String descricao;

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Carro(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public int getCalcularValorApolice() {


        return valor;
    }

    @Override
    public String getObterDescricao() {


        return descricao;
    }
}
