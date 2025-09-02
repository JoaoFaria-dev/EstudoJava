public class Produto {

    String nome;
    double preco;
    int quantidade;


    public double totalValor(){
        double valor = preco * quantidade;
        return valor;
    }

    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void retirarProduto(int quantidade){
        this.quantidade -=   quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " units, Total: $ "
                + String.format("%.2f", totalValor());
    }
}
