import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        System.out.println("Digite um valor: ");
        numero = scan.nextInt();

        for(int i = 1; i <= numero; i ++){
            System.out.printf("Digite o %d valor: ", i);
            float valor1 = scan.nextInt();

            System.out.printf("Digite o %d valor: ", i+1);
            float valor2 = scan.nextInt();

            if(valor2 == 0){
                System.out.println("Divisão Impossível");
            }
            else if (valor1 == 0){
                System.out.println("0.0");
            }
            else{
                float div = valor1/valor2;
                System.out.println("O valor da divisão é: " + div);
            }


        }
    }
}
