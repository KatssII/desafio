package _5_22_desafio_polimorfismo_e_classes_abstratas;

public class Conta {
    protected SituacaoConta situacaoConta;
    private String descricao;
    private Double valor;
    private String dataVencimento;
    public Conta() {this.situacaoConta = SituacaoConta.PENDENTE;}
    public void cancelar(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println(("Não pode cancelar uma conta que já foi paga: " + this.descricao));
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.descricao);
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }
    public SituacaoConta getSituacaoConta() {return situacaoConta;}

    public void setSituacaoConta(SituacaoConta situacaoConta) {this.situacaoConta = situacaoConta;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public Double getValor() {return valor;}

    public void setValor(Double valor) {this.valor = valor;}

    public String getDataVencimento() {return dataVencimento;}

    public void setDataVencimento(String dataVencimento) {this.dataVencimento = dataVencimento;}


    public void contas() {
        System.out.println("");
    }

}
