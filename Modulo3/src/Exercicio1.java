import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int senha = 0;

        while(senha != 2002){
            System.out.println("Digite a senha: ");
            senha = scan.nextInt();

            if(senha != 2002)
                System.out.println("Senha inválida");
        }

        System.out.println("Senha correta \nAcesso permitido");
    }
}
