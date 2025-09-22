package Entidade;

import Excecao.Excecao;

public class Conta {

    private Integer numero;
    private String dono;
    private double balanco;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numero, String dono, double balanco, Double limiteSaque) {
        this.numero = numero;
        this.dono = dono;
        this.balanco = balanco;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDono() {
        return dono;
    }

    public double getBalanco() {
        return balanco;
    }

    public void setBalanco(double balanco) {
        this.balanco = balanco;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void deposito(double montante){
        if(montante == 0){
            throw new Excecao("Erro no depósito: O valor do deposito foi de zero");
        }else{
            balanco += montante;

        }
    }

    public void saque(Double montante){
        if(balanco == 0){
            throw new Excecao("Erro de saldo: O saldo da conta é 0");
        }
        Double valorReal = balanco + limiteSaque;
        if (montante > valorReal) {
            throw new Excecao("Erro de saque: O valor do saque solicitado é maior que o limite da conta");
        }else{
            valorReal -= montante;
        }
    }
}
