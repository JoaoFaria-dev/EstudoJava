
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String comida = "sim";
        while (comida.equals("sim")) {
            System.out.println("Digite qual o código do alimento: ");
            int codigo = scan.nextInt();

            while (codigo < 1 || codigo > 5) {
                System.out.println("Desculpe, esse código não existe!\n" +
                        "Digite qual o código do alimento: ");
                codigo = scan.nextInt();
            }

            System.out.println("Digite a quantidade que queres: ");
            int quantidade = scan.nextInt();

            if(codigo == 1){
                double valor = 4.00 * quantidade;
                System.out.printf("Total: R$%.2f\n", valor );
            }
            if(codigo == 2){
                double valor = 4.50 * quantidade;
                System.out.printf("Total: R$%.2f\n", valor );
            }
            if(codigo == 3){
                double valor = 5.00 * quantidade;
                System.out.printf("Total: R$%.2f\n", valor );
            }
            if(codigo == 4){
                double valor = 2.00 * quantidade;
                System.out.printf("Total: R$%.2f\n", valor );
            }
            if(codigo == 5){
                double valor = 1.50 * quantidade;
                System.out.printf("Total: R$%.2f\n", valor );
            }

            System.out.println("Você quer pedir novamente?");
            comida = scan.next().toLowerCase();
        }
        System.out.println("Obrigado! \nVolte sempre!");
    }
}
