package exercMercado.utils;

import exercMercado.modelo.Fatura;
import exercMercado.modelo.Item;

import java.util.ArrayList;
import java.util.List;

public class FaturaCrud implements Crud<Fatura>{
    List<Fatura> listaFatura;

    public FaturaCrud() {
        this.listaFatura = new ArrayList<>();
    }

    @Override
    public void criar(Fatura obj) {
        this.listaFatura.add(obj);
    }

    @Override
    public void excluir(int id) {
        Fatura faturaEncontrado = this.listaFatura.stream().filter(fatura -> fatura.getCodigo() == id)
                .findAny().orElse(null);
        if (faturaEncontrado != null) {
            this.listaFatura.remove(faturaEncontrado);
            System.out.printf("Fatura com o id %d foi removida!", id);
            return;
        }
        System.out.printf("Fatura com o id %d não foi encontrada! \n",id);
    }

    @Override
    public void buscarPorId(int id) {
        Fatura faturaEncontrado = this.listaFatura.stream().filter(fatura -> fatura.getCodigo() == id)
                .findAny().orElse(null);
        if (faturaEncontrado != null) {
            System.out.printf("Dados da fatura com o id %d: \n %s", id, faturaEncontrado.toString());
            return;
        }
        System.out.printf("Fatura com o id %d não foi encontrado! \n",id);

    }

    @Override
    public void exibirTodosDados() {
        for (Fatura fatura : this.listaFatura) {
            System.out.printf("Faturas: %s", fatura.toString());
        }
    }

    @Override
    public List<Fatura> retornaTodos() {
        return this.listaFatura;
    }
}
