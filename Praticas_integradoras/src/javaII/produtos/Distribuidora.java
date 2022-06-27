package javaII.produtos;

import java.util.ArrayList;

public class Distribuidora {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        double precoTotal = 0;

        produtos.add(new Pereciveis("Leite",10,2));
        produtos.add(new Pereciveis("Morango",4.50,3));
        produtos.add(new Pereciveis("Biscoto Oreo",3.55,60));
        produtos.add(new Pereciveis("Coca-Cola 2L",8.50,90));
        produtos.add(new Pereciveis("Creme de Leite Nestle",12.50,1));

        produtos.add(new NaoPereciveis("Geladeira", 2500, "Eletrodomestico"));
        produtos.add(new NaoPereciveis("Sofa", 1200, "Mobilia"));
        produtos.add(new NaoPereciveis("SmartTV Samsung NEO", 12000, "Eletrodomestico"));
        produtos.add(new NaoPereciveis("PlayStation", 4700, "Games"));
        produtos.add(new NaoPereciveis("Vassoura", 35, "Produtos de limpeza"));

        //calcula produtos pereciveis
        for ( Produto produto : produtos) {
             precoTotal += produto.calcular(1);
        }

        System.out.println("Preço total produtos perecíveis: " + precoTotal);

    }
}
