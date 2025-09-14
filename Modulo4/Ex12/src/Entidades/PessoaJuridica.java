package Entidades;

public class PessoaJuridica extends Pessoa {

    protected Integer numFunc;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFunc) {
        super(nome, rendaAnual);
        this.numFunc = numFunc;
    }

    public Integer getNumFunc() {
        return numFunc;
    }

    public void setNumFunc(Integer numFunc) {
        this.numFunc = numFunc;
    }

    Double pagamento;
    @Override
    public Double imposto() {
        if(numFunc <= 10){
            pagamento = rendaAnual * 0.16;
            return pagamento;
        }else{
            pagamento = rendaAnual * 0.14;
            return pagamento;
        }
    }
}
