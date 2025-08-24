import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a hora de inicio e fim do jogo");
        System.out.print("Hora de inicio: ");
        int inicio =  scan.nextInt();
        System.out.print("Hora do fim: ");
        int fim = scan.nextInt();

        if(inicio > fim){
            int tempo = 24 - inicio + fim;
            System.out.printf("O jogo durou %d horas ", tempo);
        }else if ( inicio == fim){
            System.out.println("O jogo durou 24 horas");
        }else{
            int tempo = fim - inicio;
            System.out.printf("O jogo durou %d horas ", tempo);
        }
    }
}
