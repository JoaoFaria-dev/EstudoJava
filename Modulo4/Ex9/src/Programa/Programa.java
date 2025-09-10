package Programa;

import Entidades.Cliente;
import Entidades.ItemPedido;
import Entidades.Pedido;
import Entidades.Produto;
import Enum.StatusPedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Diga os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = scan.next();
        System.out.print("Email: ");
        String email = scan.next();
        System.out.print("Data de aniversário: (DD/MM/YYYY): ");
        Date dataDeAniversario = sdf.parse(scan.next());

        Cliente cliente = new Cliente(nome, email, dataDeAniversario);

        System.out.println("Diga os dados do pedido: ");
        System.out.print("Status: ");
        StatusPedido status = StatusPedido.valueOf(scan.next().toUpperCase());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        System.out.print("Quantos itens tem no pedido?  ");
        int quantidade = scan.nextInt();

        for(int i = 0; i<quantidade; i ++){
            System.out.printf("Diga os dados do %d item: ", i + 1);
            System.out.print("Nome do produto: ");
            String nome_Produto = scan.next();
            System.out.print("Preço: ");
            Double preco = scan.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade_Produto = scan.nextInt();

            Produto produto = new Produto(nome_Produto, preco);
            ItemPedido itemPedido = new ItemPedido(quantidade_Produto, preco, produto);

            pedido.AdicionarItem(itemPedido);

        }

        System.out.println(pedido);

        scan.close();
    }
}
