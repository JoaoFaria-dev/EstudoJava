import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = scan.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int colunas = scan.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os valores da matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Digite um valor da matriz");
        int valor = scan.nextInt();
        boolean entrada = false;

        while (entrada == false) {
            boolean encontrado = false;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == valor) {
                        System.out.println("Posição " + i + "," + j + ":");
                        if (j > 0) {
                            System.out.println("Esquerda: " + matriz[i][j - 1]);
                        }
                        if (i > 0) {
                            System.out.println("Acima: " + matriz[i - 1][j]);
                        }
                        if (j < matriz[i].length - 1) {
                            System.out.println("Direita: " + matriz[i][j + 1]);
                        }
                        if (i < matriz.length - 1) {
                            System.out.println("Abaixo: " + matriz[i + 1][j]);
                        }
                        entrada = true;
                        encontrado = true;
                    }
                }
            }
            if(!encontrado){
                System.out.println("Valor não encontrado, digite outro: ");
                valor = scan.nextInt();
            }
        }
        scan.close();
    }
}
