import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = scan.nextInt();
        Dados[] vect = new Dados[n];

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Dados da %da pessoa", i+1);
            System.out.print("\nNome: ");
            String nome = scan.next();

            System.out.print("Idade: ");
            int idade = scan.nextInt();

            System.out.print("Altura: ");
            Double altura = scan.nextDouble();

            vect[i] = new Dados(nome, idade, altura);
        }

        double sum = 0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getIdade();
        }
        double avg = sum / vect.length;
        System.out.println("O valor da media de idades é : "+ avg);

        int contabilizador = 0;
        for(int i =0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                contabilizador ++;
            }
        }
        double porcentagem = ((double)contabilizador/ vect.length) * 100;
        System.out.println("A porcentagem de pessoas menores de 16 anos é de: " + porcentagem);


        String [] vetor = new String[contabilizador];
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getIdade() < 16){
                vetor[i] = vect[i].getNome();
            }
        }
        System.out.print("O nome das pessoas que tem menos de 16 anos: " );
        for(String nomeMenor : vetor){
            System.out.println(nomeMenor);
        }

        int maiorIdade = vect[0].getIdade();
        String nomeMaiorIdade = vect[0].getNome();
        for(int i = 0; i< vect.length; i++){
            if(vect[i].getIdade() > maiorIdade){
                maiorIdade = vect[i].getIdade();
                nomeMaiorIdade = vect[i].getNome();
            }
        }
        System.out.printf("O nome da pessoa mais velha é : %s e sua idade é: %d", nomeMaiorIdade, maiorIdade);


        scan.close();
    }
}
