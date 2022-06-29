package exercMercado.utils;

import exercMercado.modelo.Cliente;
import exercMercado.modelo.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemCrud implements Crud<Item>{
    List<Item> listaItems;

    public ItemCrud() {
        this.listaItems = new ArrayList<>();
    }

    @Override
    public void criar(Item obj) {
        this.listaItems.add(obj);
    }

    @Override
    public void excluir(int id) {
        Item itemEncontrado = this.listaItems.stream().filter(item -> item.getCodigo() == id)
                .findAny().orElse(null);
        if (itemEncontrado != null) {
            this.listaItems.remove(itemEncontrado);
            System.out.printf("Item com o id %d foi removido!", id);
            return;
        }
        System.out.printf("Item com o id %d não foi encontrado! \n",id);
    }

    @Override
    public void buscarPorId(int id) {
        Item itemEncontrado = this.listaItems.stream().filter(item -> item.getCodigo() == id)
                .findAny().orElse(null);
        if (itemEncontrado != null) {
            System.out.printf("Dados do item com o id %d: \n %s", id, itemEncontrado.toString());
            return;
        }
        System.out.printf("Item com o id %d não foi encontrado! \n",id);
    }

    @Override
    public void exibirTodosDados() {
        for (Item item : this.listaItems) {
            System.out.printf("Items: %s", item.toString());
        }
    }

    @Override
    public List<Item> retornaTodos() {
        return this.listaItems;
    }
}
