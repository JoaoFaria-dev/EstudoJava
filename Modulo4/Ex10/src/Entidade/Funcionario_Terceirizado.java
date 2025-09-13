package Entidade;

public class Funcionario_Terceirizado extends Funcionario{

    protected Double valorAdicional;

    public Funcionario_Terceirizado() {
    }

    public Funcionario_Terceirizado(String nome, Integer horas, Double valorPorHora, Double valorAdicional) {
        super(nome, horas, valorPorHora);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public Double pagamento(){
        return super.pagamento() + 1.1 * valorPorHora;
    }

}
