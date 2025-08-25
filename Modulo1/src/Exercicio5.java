import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o codigo da peça 1, o número de peças e o valor de cada peça");
        int cod1, peca1;
        float num1;
        cod1 = scan.nextInt();
        peca1 = scan.nextInt();
        num1 = scan.nextFloat();

        System.out.println("Digite o codigo da peça 2, o número de peças e o valor de cada peça");
        int cod2, peca2;
        float num2;
        cod2 = scan.nextInt();
        peca2 = scan.nextInt();
        num2 = scan.nextFloat();

        Float valor = (peca1 * num1) + (peca2 * num2);
        System.out.println("O valor a ser pago é: "+ valor);
    }
}
