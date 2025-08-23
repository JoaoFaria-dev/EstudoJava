import java.util.Scanner;

public class Exercicio4 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, bom dia!");
        System.out.println("Digite o seu número: ");
        int numero = scan.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        float horas = scan.nextFloat();

        System.out.println("Digite, por fim, o valor que você recebe por hora: ");
        float valor = scan.nextFloat();

        float salario = horas * valor;

        System.out.printf("O seu número é : %d%n"+
                "O valor do seu salario é: R$%.2f", numero, salario );
    }
}
