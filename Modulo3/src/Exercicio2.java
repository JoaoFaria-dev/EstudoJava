import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codigo, contabilizador1, contabilizador2, contabilizador3;
        codigo = 0;
        contabilizador1 = 0;
        contabilizador2 = 0;
        contabilizador3 = 0;

        while (codigo != 4){
            System.out.println("Digite o código de sua preferência" +
                    "\n1- Alcool 2-Gasolina 3-Diesel 4-Fim");

            codigo = scan.nextInt();

            while(codigo > 4 || codigo < 1){
                System.out.println("Codigo Inválido\nDigite um código válido" +
                        "\n1-Álcool 2-Gasolina 3-Diesel 4-Fim");

                codigo = scan.nextInt();
            }

            if(codigo == 1){
                contabilizador1 ++;
            }else if (codigo == 2){
                contabilizador2 ++;
            }else if (codigo == 3){
                contabilizador3 ++;
            }
        }

        System.out.printf("Muito obrigado!!" +
                "\nÁlcool = %d" +
                "\nGasolina = %d" +
                "\nDiesel = %d", contabilizador1, contabilizador2, contabilizador3);
    }
}
