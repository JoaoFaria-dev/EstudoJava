public class Triangulo {

    double a;
    double b;
    double c;

    public  double area(){
        double p = (a+b+c) / 2;
        double valor = Math.sqrt(p * (p-a) * (p-b) * (p*c));
        return valor;
    }
}
