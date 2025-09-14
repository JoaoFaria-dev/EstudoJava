package Aplicativo;

import Entidades.Produto;
import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Produto> prod = new ArrayList<>();

        System.out.print("Digite o número de produtos: ");
        int qntd = scan.nextInt();

        for(int i = 1 ; i<=qntd; i++ ){
            System.out.println("\nProduto #" + i);
            System.out.print("Comum, importado ou usado? (c/i/u): ");
            char tipo = scan.next().toLowerCase().charAt(0);
            System.out.print("Nome: ");
            String nome = scan.next();
            System.out.print("Preço: ");
            Double preco = scan.nextDouble();

            if(tipo == 'c'){
                Produto produto = new Produto(preco, nome);
                prod.add(produto);
            }
            else if(tipo == 'i'){
                System.out.print("Valor da taxa: ");
                Double taxa = scan.nextDouble();
                Produto produto = new ProdutoImportado(preco, nome, taxa);
                prod.add(produto);
            }else{
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate data = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                prod.add(new ProdutoUsado(preco, nome, data));
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Produto p : prod) {
            System.out.println(p.PrecoTag());
        }

        scan.close();
    }
}
