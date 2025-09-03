public class Dados {

    private String nome;
    private int Idade;
    private Double altura;

    public Dados(String nome, int idade, Double altura) {
        this.nome = nome;
        Idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return Idade;
    }


    public Double getAltura() {
        return altura;
    }

}
