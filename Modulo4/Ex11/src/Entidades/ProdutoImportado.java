package Entidades;

public class ProdutoImportado extends Produto{

    protected double taxaCustomizada;

    public ProdutoImportado() {
    }

    public ProdutoImportado(Double preco, String nome, double taxaCustomizada) {
        super(preco, nome);
        this.taxaCustomizada = taxaCustomizada;
    }

    public double getTaxaCustomizada() {
        return taxaCustomizada;
    }

    public void setTaxaCustomizada(double taxaCustomizada) {
        this.taxaCustomizada = taxaCustomizada;
    }

    public Double precoTotal(){
        return preco + taxaCustomizada;
    }

    public String PrecoTag(){
        return super.PrecoTag() + "\nTaxa adicionada: " + taxaCustomizada
                                + "\nPreco Final: " + precoTotal();
    }
}
