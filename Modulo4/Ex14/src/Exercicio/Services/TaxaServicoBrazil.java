package Exercicio.Services;

public class TaxaServicoBrazil implements TaxaServico {

    public double Taxa(double amount){
        if(amount <= 100){
            return amount * 0.2;
        }else{
            return amount * 0.15;
        }
    }
}
