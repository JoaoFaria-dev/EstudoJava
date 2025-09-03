import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Diga a quantidade de itens: ");
        int n = scan.nextInt();
        Produto[] vect = new Produto[n];

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Diga o nome do itenm %d:", i+1);
            String nome = scan.next();
            System.out.printf("Diga o valor do itenm %d:", i+1);
            Double preco = scan.nextDouble();

            vect[i] = new Produto(nome, preco);
        }

        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPreco();
        }

        double avg = sum / vect.length;
        System.out.println("A media do preço desses itens é: " + avg);


        scan.close();
    }
}
