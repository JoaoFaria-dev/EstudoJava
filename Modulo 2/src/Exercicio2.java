import java.util.Scanner;

public class Exercicio2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        int valor = scan.nextInt();

        if(valor % 2 == 0){
            System.out.println("Numero par");
        }
        else{
            System.out.println("Numero impar");
        }
    }
}
