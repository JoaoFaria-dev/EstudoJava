import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor, fatorial = 1;
        System.out.println("Digite um valor: ");
        valor = scan.nextInt();

        for(int i = 1; i <= valor; i++ ){
            fatorial *= i ;
        }

        System.out.println("O valor do fatorial é: " + fatorial);

    }
}
