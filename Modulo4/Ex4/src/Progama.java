import java.util.Scanner;

public class Progama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numero = scan.nextInt();

        System.out.println("Digite o seu nome: ");
        String nome = scan.next();

        System.out.println("Tem depósito inicial? (sim/nao)");
        String resposta = scan.next().toLowerCase();

        Banco banco;

        if(resposta.equals("sim")){
            System.out.println("Digite o deposito: ");
            double deposito = scan.nextDouble();

            banco = new Banco(numero, nome, deposito);
        } else {
            banco = new Banco(numero, nome);
        }

        System.out.println(banco);

        System.out.println("Quer depositar dinheiro? (sim/nao)");
        String resposta2 = scan.next().toLowerCase();

        if(resposta2.equals("sim")){
            System.out.println("Digite o deposito: ");
            double valor = scan.nextDouble();

            banco.adicionarValor(valor);
            System.out.println("Atualização da conta: ");
            System.out.println(banco);
        } else {
            System.out.println("A conta não mudou");
        }

        System.out.println("Quer retirar dinheiro? (sim/nao)");
        String resposta3 = scan.next().toLowerCase();

        if(resposta3.equals("sim")){
            System.out.println("Digite o valor para retirar: ");
            double valor = scan.nextDouble();

            banco.retirarValor(valor);
            System.out.println("Atualização da conta: ");
            System.out.println(banco);
        } else {
            System.out.println("A conta não mudou");
        }

        scan.close();
    }
}
