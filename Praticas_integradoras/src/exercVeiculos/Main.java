package exercVeiculos;

import exercVeiculos.modelo.Garagem;
import exercVeiculos.modelo.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaVeiculos = new ArrayList<>();

        listaVeiculos.add(new Veiculo("Fiesta","Ford",1000));
        listaVeiculos.add(new Veiculo("Focus","Ford",1200));
        listaVeiculos.add(new Veiculo("Explorer","Ford",2500));
        listaVeiculos.add(new Veiculo("Uno","Fiat",500));
        listaVeiculos.add(new Veiculo("Cronos","Fiat",1000));
        listaVeiculos.add(new Veiculo("Torino","Fiat",1250));
        listaVeiculos.add(new Veiculo("Aveo","Chevrolet",1250));
        listaVeiculos.add(new Veiculo("Spin","Chevrolet",2500));
        listaVeiculos.add(new Veiculo("Corola","Toyota",1200));
        listaVeiculos.add(new Veiculo("Fortuner","Toyota",3000));
        listaVeiculos.add(new Veiculo("Logan","Renault",950));

        Garagem garagem = new Garagem(1, listaVeiculos);

        garagem.ordenarPreco();
        System.out.println("\n");

        garagem.ordenarMarca();
        System.out.println("\n");

        garagem.verificaPrecos();
    }
}
