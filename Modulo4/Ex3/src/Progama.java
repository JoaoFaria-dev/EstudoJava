import java.util.Scanner;

public class Progama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Conversor conversor = new Conversor();

        System.out.print("Qual o valor do dolar? ");
        conversor.preco = scan.nextDouble();

        System.out.print("Quantos dolares você quer comprar? ");
        conversor.quantidade = scan.nextDouble();

        System.out.println(conversor);

        scan.close();
    }
}
