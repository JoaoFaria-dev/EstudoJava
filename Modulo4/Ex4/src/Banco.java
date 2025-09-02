public class Banco {

    private int conta;
    private String dono;
    double deposito;
    private static double taxa = 5;

    public Banco() {
    }

    public Banco(int conta, String dono) {
        this.conta = conta;
        this.dono = dono;
    }

    public Banco(int conta, String dono, double deposito) {
        this.conta = conta;
        this.dono = dono;
        this.deposito = deposito;
    }

    public int getConta() {
        return conta;
    }

    public String getDono() {
        return dono;
    }


    public void adicionarValor(double quantidade){
        this.deposito += quantidade;
    }

    public void retirarValor(double quantidade){
        this.deposito = this.deposito - quantidade - taxa;
    }

    public String toString(){
        return "A conta é: "
                + conta
                + ", Dono: "
                + dono
                + ", o balanço da conta: R$ "
                + deposito;
    }

}
