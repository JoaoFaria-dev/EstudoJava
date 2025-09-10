package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Poste {
    private Date monento;
    private String titulo;
    private String conteudo;
    private Integer like;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private List<Comentarios> coment = new ArrayList<>();

    public Poste(Date monento, String titulo, String conteudo, Integer like) {
        this.monento = monento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.like = like;
    }

    public Poste(Date monento, List<Comentarios> coment, String titulo, String conteudo, Integer like) {
        this.monento = monento;
        this.coment = coment;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.like = like;
    }

    public Poste() {
    }

    public Date getMonento() {
        return monento;
    }

    public void setMonento(Date monento) {
        this.monento = monento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public List<Comentarios> getComent() {
        return coment;
    }

    public void AdicionarComents (Comentarios comentario){
        this.coment.add(comentario);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(like );
        sb.append(" Likes- ");
        sb.append(sdf.format(monento) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentários: \n");
        for(Comentarios c : coment ){
            sb.append(c.getTexto() + "\n");
        }
        return sb.toString();

        // String é imutável: cada modificação cria um novo objeto.
        // StringBuilder é mutável: permite alterar o conteúdo sem criar novos objetos.
        // Use StringBuilder para melhor desempenho em concatenações repetidas.
    }
}

