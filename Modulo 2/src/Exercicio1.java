import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scan.nextInt();

        if(valor > 0){
            System.out.println("O valor é positivo");
        } else if (valor == 0) {
            System.out.println("O valor é nulo");
        }
        else{
            System.out.println("O valor é nagativo");
        }
    }
}
