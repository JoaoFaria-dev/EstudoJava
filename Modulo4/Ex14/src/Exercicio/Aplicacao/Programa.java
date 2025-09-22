package Exercicio.Aplicacao;


import Exercicio.Entidade.AluguelCarro;
import Exercicio.Entidade.Veiculo;
import Exercicio.Services.ServicoAluguel;
import Exercicio.Services.TaxaServicoBrazil;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args)  {
        Scanner scan =  new Scanner(System.in);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modelo = scan.next();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(scan.next(), formato);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime fim = LocalDateTime.parse(scan.next(), formato);

        AluguelCarro alc = new AluguelCarro(inicio, fim, new Veiculo(modelo));

        System.out.print("Entre com o preço por hora: ");
        double precoPorHora = scan.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double precoPorDia = scan.nextDouble();

        ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorDia, precoPorHora, new TaxaServicoBrazil());

        servicoAluguel.precessoFatura(alc);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + String.format("%.2f", alc.getPagamento().getPagamentoBase()));
        System.out.println("Imposto: " + String.format("%.2f", alc.getPagamento().getTaxa()));
        System.out.println("Pagamento total: " + String.format("%.2f", alc.getPagamento().getPagamentoBase()));

        scan.close();
    }
}
