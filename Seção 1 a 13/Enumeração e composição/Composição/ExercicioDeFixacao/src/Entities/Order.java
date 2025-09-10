package Entities;

import Entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");


    private Date moment;
    private OrderStatus status;

    private Client cliente;

    private List<OrderItem> itens = new ArrayList<>();


    public  Order(){}

    public Order(Date moment, OrderStatus status, Client cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public List<OrderItem> getItens() {
        return itens;
    }

   //met

    public void addItem(OrderItem item){
        itens.add(item);
    }

    public void removeItem(OrderItem item){
        itens.remove(item);
    }

    public Double Total(){
        double sum = 0;

            for (OrderItem item : itens ){
                sum += item.subTotal();
            }

            return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Order Status: ");
        sb.append(status).append("\n");
        sb.append("Cliente: ").append(cliente.getName()).append(" ");
        sb.append(" (");
        sb.append(sdf1.format(cliente.getBirthDate())).append(") ").append(" - ").append(cliente.getEmail());
        sb.append("\n");
        sb.append("Order items: ");
        sb.append("\n");

            for(OrderItem item: itens){
                sb.append(item).append("\n");
            }

        sb.append("Total price: $");
        sb.append(String.format("%.2f", Total()));
        return sb.toString();


    }

}
