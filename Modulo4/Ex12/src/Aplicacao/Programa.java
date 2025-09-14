package Aplicacao;

import Entidades.Pessoa;
import Entidades.PessoaFisica;
import Entidades.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Pessoa> pessoa = new ArrayList<>();


        System.out.print("Diga a quantidade de pagantes: ");
        Integer n = scan.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.print("Pessoa física ou jurídica? (f/j): ");
            char p = scan.next().toLowerCase().charAt(0);

            System.out.print("Nome: ");
            String nome = scan.next();

            System.out.print("Renda anual: ");
            Double renda = scan.nextDouble();

            if(p == 'f'){
                System.out.print("Quanto foi o gasto com a saúde? ");
                Double gastoS = scan.nextDouble();

                Pessoa pess = new PessoaFisica(nome, renda, gastoS);
                pessoa.add(pess);
            }else{
                System.out.print("Quantos funcionários tens? ");
                int func = scan.nextInt();

                Pessoa pess = new PessoaJuridica(nome, renda, func);
                pessoa.add(pess);
            }
        }

        System.out.println("Taxas a serem pagas: ");
        for(Pessoa p : pessoa){
            System.out.println(p);
        }

        Double sum = 0.0;
        for(Pessoa p: pessoa){
            sum += p.imposto();
        }
        System.out.print("Total de taxa: " + sum);

        scan.close();
    }
}
