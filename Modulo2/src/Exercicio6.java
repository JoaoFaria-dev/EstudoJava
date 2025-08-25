import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        float salario = scan.nextFloat();

        if (salario <= 2000){
            System.out.println("Você esta isento.");
        }
        else if ( 2000 < salario && salario <=3000){
            float imposto = (salario-2000) * 8/100;
            System.out.printf("Imposto a ser pago = %.2f", imposto);
        }
        else  if ( 3000<salario && salario <= 4500){
            float imposto = 1000 * 8/100 + ((salario - 3000) * 18/100);
            System.out.printf("Imposto a ser pago = %.2f", imposto);
        }
        else{
            float imposto = 1000 * 8/100 + (1500 * 18/100) + ((salario - 4500) * 28/100);
            System.out.printf("Imposto a ser pago = %.2f", imposto);
        }
    }
}
