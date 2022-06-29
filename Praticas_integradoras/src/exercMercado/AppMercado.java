package exercMercado;

import exercMercado.modelo.Cliente;
import exercMercado.modelo.Fatura;
import exercMercado.modelo.Item;
import exercMercado.utils.ClienteCrud;
import exercMercado.utils.FaturaCrud;
import exercMercado.utils.ItemCrud;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMercado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ClienteCrud clienteCrud = new ClienteCrud();
        ItemCrud itemCrud = new ItemCrud();
        FaturaCrud faturaCrud = new FaturaCrud();

        clienteCrud.criar(new Cliente(1, "Tiago", "Da Silva"));
        clienteCrud.criar(new Cliente(2, "Carla", "Augusta"));
        clienteCrud.criar(new Cliente(3, "Bernardo", "Pattier"));

        clienteCrud.exibirTodosDados();
        clienteCrud.excluir(2);

        System.out.println("Lista atualizada após exclusão: \n");
        clienteCrud.exibirTodosDados();

        System.out.println("Qual o ID do cliente?");
        int idEntrada = entrada.nextInt();
        clienteCrud.buscarPorId(idEntrada);

        itemCrud.criar(new Item(1,2,10, "Coca-cola 2L"));
        itemCrud.criar(new Item(2,1,1, "Miojo Nissin"));
        itemCrud.criar(new Item(3,4,2.50, "Biscoito Oreo"));

        Fatura fatura =  new Fatura(1, new Cliente(4, "Maria", "Clara"), itemCrud.retornaTodos());
        faturaCrud.criar(fatura);

        fatura.calculaPrecoTotal();
    }
}
