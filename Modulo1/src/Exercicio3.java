import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){
        Scanner scan  = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = scan.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valor3 = scan.nextInt();

        System.out.println("Digite o quarto valor: ");
        int valor4 = scan.nextInt();

        int diferenca = (valor1 * valor2) - (valor3 * valor4);
        System.out.println("O valor da diferença é = " + diferenca);
    }
}
