import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois valores");
        System.out.print("Valor 1: ");
        int valor1 = scan.nextInt();
        System.out.print("Valor 2: ");
        int valor2 = scan.nextInt();

        if (valor1 > valor2) {
            if (valor1 % valor2 == 0) {
                System.out.println("São multiplos");
            } else {
                System.out.println("Não são multiplos");
            }
        } else {
            if (valor2 % valor1 == 0) {
                System.out.println("São multiplos");
            } else {
                System.out.println("Não são multiplos");
            }

        }
    }
}
