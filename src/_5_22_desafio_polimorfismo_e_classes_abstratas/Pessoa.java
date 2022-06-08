package _5_22_desafio_polimorfismo_e_classes_abstratas;

public abstract class Pessoa {
    protected String pessoa;

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public abstract String getNome();
}
