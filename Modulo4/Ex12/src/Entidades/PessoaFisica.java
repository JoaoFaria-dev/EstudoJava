package Entidades;

public class PessoaFisica extends Pessoa{

    protected Double gastosSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    Double pagamento;
    @Override
    public Double imposto() {
        if(rendaAnual < 20000){
            pagamento = rendaAnual * 0.15;
            if(gastosSaude != 0){
                pagamento = pagamento - (gastosSaude*0.5);
                return pagamento;
            }else{
                return pagamento;
            }
        }else{
            pagamento = rendaAnual * 0.25;
            if(gastosSaude != 0){
                pagamento = pagamento - (gastosSaude*0.5);
                return pagamento;
            }else{
                return pagamento;
            }
        }
    }
}
