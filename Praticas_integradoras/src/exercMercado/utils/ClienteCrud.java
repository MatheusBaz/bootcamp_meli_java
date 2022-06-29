package exercMercado.utils;

import exercMercado.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteCrud implements Crud<Cliente>{
    List<Cliente> listaClientes;

    public ClienteCrud() {
        this.listaClientes = new ArrayList<>();
    }

    @Override
    public void criar(Cliente obj) {
        this.listaClientes.add(obj);
    }

    @Override
    public void excluir(int id) {
        Cliente clienteEncontrado = this.listaClientes.stream().filter(cliente -> cliente.getId() == id)
                .findAny().orElse(null);
        if (clienteEncontrado != null) {
            this.listaClientes.remove(clienteEncontrado);
            System.out.printf("Cliente com o id %d foi removido! \n",id);
            return;
        }
        System.out.printf("Cliente com o id %d não foi encontrado! \n",id);
    }

    @Override
    public void buscarPorId(int id) {
        Cliente clienteEncontrado = this.listaClientes.stream().filter(cliente -> cliente.getId() == id)
                .findAny().orElse(null);
        if (clienteEncontrado != null) {
            System.out.printf("Dados do cliente com o id %d: \n %s", id, clienteEncontrado.toString());
            return;
        }
        System.out.printf("Cliente com o id %d não foi encontrado! \n",id);
    }

    @Override
    public void exibirTodosDados() {
        for (Cliente cliente : this.listaClientes) {
            System.out.printf("Clientes: %s", cliente.toString());
        }
    }

    @Override
    public List<Cliente> retornaTodos() {
        return this.listaClientes;
    }
}
