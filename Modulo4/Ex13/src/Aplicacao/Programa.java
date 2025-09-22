package Aplicacao;

import Entidade.Conta;
import Excecao.Excecao;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);


        try{
            System.out.print("Coloque os dados da conta: ");
            System.out.print("\nNúmero: ");
            int num = scan.nextInt();
            System.out.print("Nome: ");
            String nome = scan.next();
            System.out.print("Balanço inicial: ");
            double balanco = scan.nextDouble();
            System.out.print("Limite de saque: ");
            double limite = scan.nextDouble();

            Conta con = new Conta(num, nome, balanco, limite);

            System.out.print("Quer depositar ou sacar? (d/s) ");
            char resp = scan.next().toLowerCase().charAt(0);

            if (resp == 'd') {
                System.out.print("Valor do deposito: ");
                double dep = scan.nextDouble();
                con.deposito(dep);
                System.out.println("O balanço da conta foi atualizado!");
                System.out.println("O balanço é: " + con.getBalanco());
            }else{
                System.out.print("\nDiga quanto quer sacar: ");
                double saque = scan.nextDouble();
                con.saque(saque);
                System.out.println("O balanço da conta foi atualizado!");
                System.out.println("O balanço é: " + con.getBalanco());
            }
        }
        catch (Excecao e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Programa finalizado!");
        }


        scan.close();
    }
}
