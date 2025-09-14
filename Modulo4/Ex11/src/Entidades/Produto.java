package Entidades;

public class Produto {

    protected  String nome;
    protected Double preco;

    public Produto() {
    }

    public Produto(Double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String PrecoTag(){
        return "Nome: " + nome
                + "\nPreço: " + preco;
    }
}
