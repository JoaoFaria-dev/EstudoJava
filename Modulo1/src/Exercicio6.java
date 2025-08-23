import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Double valor1, valor2, valor3;
        System.out.println("Digite os valores para descobrir as áreas: ");
        valor1 = scan.nextDouble();
        valor2 = scan.nextDouble();
        valor3 = scan.nextDouble();

        double areaT = valor1*valor3 / 2;
        double areaC = (valor3 * valor3) * 3.14159;
        double areaTra = (valor1 + valor2) * valor3 / 2;
        double areaQ = valor2 * valor2;
        double areaR = valor1 * valor2;


        System.out.printf("O valor da área do Triangulo é: %.3f%n" +
                "O valor da área do Circulo é: %.3f%n" +
                "O valor da área do Trapezio é: %.3f%n" +
                "O valor da área do Quadrado é: %.3f%n" +
                "O valor da área do Retangulo é: %.3f%n", areaT , areaC , areaTra , areaQ , areaR);
    }
}
