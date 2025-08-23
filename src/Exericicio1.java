import java.util.Scanner;

public class Exericicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scan.nextInt();

        int soma = valor1 + valor2;

        System.out.println("O valor da soma desses valores é: " + soma);
    }
}
