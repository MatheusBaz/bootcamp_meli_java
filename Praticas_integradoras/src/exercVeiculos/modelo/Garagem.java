package exercVeiculos.modelo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Garagem {
    int id;
    List<Veiculo> listaVeiculos;

    public Garagem(int id, List<Veiculo> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public void ordenarPreco() {
       List<Veiculo> listaOrdenada = this.listaVeiculos.stream().sorted(Comparator.comparingDouble(Veiculo::getPreco))
               .collect(Collectors.toList());
       listaOrdenada.forEach(System.out::println);
    }

    public void ordenarMarca() {
        List<Veiculo> listaOrdenada = this.listaVeiculos.stream().sorted(Comparator.comparing(Veiculo::getMarca))
                .collect(Collectors.toList());
        listaOrdenada.forEach(System.out::println);
    }

    public void verificaPrecos() {
        List precoMenor1000 = this.listaVeiculos.stream().filter(veiculo -> veiculo.getPreco() < 1000)
                .collect(Collectors.toList());
        List precoMaiorIgual1000 = this.listaVeiculos.stream().filter(veiculo -> veiculo.getPreco() >= 1000)
                .collect(Collectors.toList());
        double precoMedioTotal = this.listaVeiculos.stream().mapToDouble(veiculo ->
                                veiculo.getPreco()+veiculo.getPreco()/this.listaVeiculos.size()).sum();

        System.out.println("Veiculos com preço abaixo de 1000: " + precoMenor1000 + "\n Veiculos com preço igual ou" +
                "acima de 1000: " + precoMaiorIgual1000 + " \n preço médios de todos: " + precoMedioTotal);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
}
