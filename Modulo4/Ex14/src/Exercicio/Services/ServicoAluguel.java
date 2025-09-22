package Exercicio.Services;

import Exercicio.Entidade.AluguelCarro;
import Exercicio.Entidade.Pagamento;

import java.time.Duration;

public class ServicoAluguel {

    protected Double precoHora;
    protected Double precoDia;

    private TaxaServico taxa;

    //Não vai colocar o construtor sem parametro, porque quer obrigar a instanciar os parametros
    public ServicoAluguel(Double precoHora, Double precoDia, TaxaServico taxa) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.taxa = taxa;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(Double precoDia) {
        this.precoDia = precoDia;
    }

    public void precessoFatura (AluguelCarro aluguelCarro){

        Long minutos = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim()).toMinutes();
        Long horas = minutos / 60;

        double pagamentoBasico;
        if (horas <= 12){
            pagamentoBasico = precoHora * Math.ceil(horas); //ceil arredonda para cima
        }else{
            pagamentoBasico = precoDia * Math.ceil(horas / 24);
        }

        double taxa = new TaxaServicoBrazil().Taxa(pagamentoBasico);


        aluguelCarro.setPagamento((new Pagamento(pagamentoBasico, taxa)));
    }
}
