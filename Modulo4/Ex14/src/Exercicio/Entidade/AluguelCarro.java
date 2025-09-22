package Exercicio.Entidade;

import java.time.LocalDateTime;

public class AluguelCarro {

    protected LocalDateTime inicio;
    protected LocalDateTime fim;
    protected Veiculo modelo;
    protected Pagamento pagamento;

    public AluguelCarro() {
    }

    public AluguelCarro(LocalDateTime inicio, LocalDateTime fim, Veiculo modelo) {
        this.inicio = inicio;
        this.fim = fim;
        this.modelo = modelo;
    }

    public AluguelCarro(LocalDateTime inicio, Veiculo modelo, LocalDateTime fim, Pagamento pagamento) {
        this.inicio = inicio;
        this.modelo = modelo;
        this.fim = fim;
        this.pagamento = pagamento;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Veiculo getModelo() {
        return modelo;
    }

    public void setModelo(Veiculo modelo) {
        this.modelo = modelo;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
