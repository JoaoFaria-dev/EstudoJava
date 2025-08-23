import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do raio:");
        double raio = scan.nextDouble();

        double area = raio * raio * 3.14159;

        System.out.println("O valor da area é: " + area);





    }
}
