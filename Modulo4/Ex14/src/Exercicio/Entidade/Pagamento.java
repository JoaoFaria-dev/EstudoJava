package Exercicio.Entidade;

public class Pagamento {

    protected Double pagamentoBase;
    protected Double taxa;
    

    public Pagamento(Double pagamentoBase, Double taxa) {
        this.pagamentoBase = pagamentoBase;
        this.taxa = taxa;

    }

    public Pagamento() {
    }

    public Double getPagamentoBase() {
        return pagamentoBase;
    }

    public void setPagamentoBase(Double pagamentoBase) {
        this.pagamentoBase = pagamentoBase;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }


    public Double totalPagamento(){
        return getPagamentoBase() + getTaxa();
    }
}
