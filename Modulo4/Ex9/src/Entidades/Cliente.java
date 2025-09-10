package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private Date dataDeAniversario;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Cliente(String nome, String email, Date dataDeAniversario) {
        this.nome = nome;
        this.email = email;
        this.dataDeAniversario = dataDeAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDeAniversario() {
        return dataDeAniversario;
    }

    public void setDataDeAniversario(Date dataDeAniversario) {
        this.dataDeAniversario = dataDeAniversario;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "Nome ='" + nome + '\'' +
                ", Email ='" + email + '\'' +
                ", Data De Aniversario=" + sdf.format(dataDeAniversario);
    }
}
