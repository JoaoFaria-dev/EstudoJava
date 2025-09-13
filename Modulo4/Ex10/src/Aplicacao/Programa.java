package Aplicacao;

import Entidade.Funcionario;
import Entidade.Funcionario_Terceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Funcionario> func = new ArrayList<>();


        System.out.print("Numero de funcionários: ");
        int qntd = scan.nextInt();

        for(int i = 0; i < qntd; i ++){
            System.out.print("Funcionário #" + i+1);
            System.out.print("\nTercerizado? (sim/nao): ");
            String terc = scan.next().toLowerCase();
            System.out.print("Nome: ");
            String nome = scan.next();
            System.out.print("Horas: ");
            int horas = scan.nextInt();
            System.out.print("Valor por hora: ");
            double valor = scan.nextDouble();

            if (!terc.equals("sim")){
                Funcionario funcionario = new Funcionario(nome, horas, valor);
                func.add(funcionario);
            }else{
                System.out.print("Valor adicional: ");
                double valor_a_mais = scan.nextDouble();
                Funcionario funcionario1 = new Funcionario_Terceirizado(nome, horas, valor, valor_a_mais);
                func.add(funcionario1);
            }
        }

        for(Funcionario f : func){
            System.out.printf("%s - $%.2f", f.getNome(), f.pagamento() );
        }
        scan.close();
    }
}
