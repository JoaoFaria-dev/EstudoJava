package Entidades;
import Enum.StatusPedido;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date momento;
    private StatusPedido status;
    private Cliente cliente;
    private List<ItemPedido> pedido = new ArrayList<ItemPedido>();

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void AdicionarItem(ItemPedido item){
        this.pedido.add(item);
    }

    public void RemoverItem(ItemPedido item){
        this.pedido.remove(item);
    }

    public double total(){
        double soma = 0.0;
        for(ItemPedido it : pedido){
            soma += it.SubTotal();
        }
        return soma;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status do pedido ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Item pedido:\n");
        for (ItemPedido item : pedido) {
                sb.append(item + "\n");
        }
        sb.append("Total preço : $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
