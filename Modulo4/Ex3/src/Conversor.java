public class Conversor {

    Double preco;
    Double quantidade;

    public static double IOF = 1.06;

    public double valor(){
        double valor1 = preco * quantidade;
        double valorFinal = valor1 * IOF;
        return valorFinal;
    }

    public String toString() {
        return "O valor a ser pago é: "
                + valor();
    }
}
