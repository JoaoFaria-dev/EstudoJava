import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resposta;
        String respostan;
        int quantidade;

        Produto produto = new Produto();

        System.out.println("Digite os dados do produto");
        System.out.print("Nome: ");
        produto.nome = scan.next();
        System.out.print("\nPreço: ");
        produto.preco = scan.nextDouble();
        System.out.print("\nQuantidade no estoque:");
        produto.quantidade = scan.nextInt();

        System.out.println("Dados do produto: " + produto);

        System.out.println("Você quer adicionar mais produtos? ");
        resposta = scan.next().toLowerCase();

        while (resposta.equals("sim")) {
            System.out.println("Diga a quantidade de produtos que quer adicionar: ");
            quantidade = scan.nextInt();
            produto.adicionarProdutos(quantidade);

            System.out.println("Dados do produto: " + produto);

            System.out.println("Quer diminuir a quantidade? (sim/nao)");
            respostan = scan.next().toLowerCase();

            while (respostan.equals("sim")) {
                System.out.println("Diga a quantidade de produtos que quer retirar: ");
                quantidade = scan.nextInt();
                produto.retirarProduto(quantidade);

                System.out.println("Dados do produto: " + produto);

                System.out.println("Quer diminuir mais a quantidade? (sim/nao)");
                respostan = scan.next().toLowerCase();
            }

            System.out.println("Quer aumentar mais a quantidade? (sim/nao)");
            resposta = scan.next().toLowerCase();
        }

        System.out.println("Obrigado!!");

        scan.close();
    }
}



