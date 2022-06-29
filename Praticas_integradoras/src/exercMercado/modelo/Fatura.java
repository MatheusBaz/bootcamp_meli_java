package exercMercado.modelo;

import java.util.List;

public class Fatura {
    private int codigo;
    private Cliente cliente;
    private List<Item> listaItems;
    private double totalPrecoCompra;

    public Fatura(int codigo, Cliente cliente, List<Item> listaItems) {
        this.cliente = cliente;
        this.listaItems = listaItems;
        this.codigo = codigo;
    }

    public void calculaPrecoTotal() {
       double total = listaItems.stream().mapToDouble(item -> item.getPrecoUnitario() + item.getPrecoUnitario())
               .sum();
        System.out.printf("Preço total dos items: %f",total);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItem() {
        return listaItems;
    }

    public void setItem(List<Item> listaItems) {
        this.listaItems = listaItems;
    }

    public double getTotalPrecoCompra() {
        return totalPrecoCompra;
    }

    public void setTotalPrecoCompra(double totalPrecoCompra) {
        this.totalPrecoCompra = totalPrecoCompra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "codigo=" + codigo +
                ", cliente=" + cliente +
                ", listaItems=" + listaItems +
                ", totalPrecoCompra=" + totalPrecoCompra +
                "} \n";
    }
}
