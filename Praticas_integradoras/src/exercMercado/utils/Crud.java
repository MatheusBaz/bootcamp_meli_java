package exercMercado.utils;

import java.util.List;

public interface Crud<T> {
    public void criar (T obj);
    public void excluir (int id);
    public void buscarPorId (int id);
    public void exibirTodosDados();
    public List<T> retornaTodos();
}
