import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor, numero, contabilizador1, contabilizador2;
        contabilizador1 = 0;
        contabilizador2 = 0;

        System.out.println("Diga um valor: ");
        valor= scan.nextInt();

        for(int i = 1; i <= valor; i++){
            System.out.printf("Digite o valor %d: ", i);
            numero = scan.nextInt();

            if(numero >= 10 && numero < 20){
                contabilizador1 ++;
            }else{
                contabilizador2 ++;
            }
        }

        System.out.printf("in %d" +
                "\nout %d", contabilizador1, contabilizador2);
    }
}
