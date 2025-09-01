import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Diga os valores do triângulo x: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Diga os valores do triângulo y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("O valor da área do triangulo com os valores de X é: " + areaX);
        System.out.println("O valor da área do triangulo com os valores de Y é: " + areaY);

        if(areaX > areaY)
            System.out.println("A maior área é : " + areaX);
        else
            System.out.println("A maior área é : " + areaY);




        scan.close();
    }
}
