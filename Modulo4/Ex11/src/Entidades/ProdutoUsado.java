package Entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ProdutoUsado extends Produto{

    protected LocalDate dataDeFabricacao;

    public ProdutoUsado() {
    }

    public ProdutoUsado(Double preco, String nome, LocalDate dataDeFabricacao) {
        super(preco, nome);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public LocalDate dataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void dataDeFabricacao(LocalDate dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public String PrecoTag(){
        return super.PrecoTag() + "\nData de : fabricação: " + dataDeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
