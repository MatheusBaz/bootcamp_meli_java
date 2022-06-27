package praticaIntegradora04.exercicio02;

import java.util.ArrayList;

public class Distribuidora {
    public static void main(String[] args) {
        ArrayList<Pereciveis> produtosPereciveis = new ArrayList<>();
        ArrayList<NaoPereciveis> produtosNaoPereciveis = new ArrayList<>();
        double precoTotalPereciveis = 0;
        double precoTotalNaoPereciveis = 0;

        produtosPereciveis.add(new Pereciveis("Leite",10,2));
        produtosPereciveis.add(new Pereciveis("Morango",4.50,3));
        produtosPereciveis.add(new Pereciveis("Biscoto Oreo",3.55,60));
        produtosPereciveis.add(new Pereciveis("Coca-Cola 2L",8.50,90));
        produtosPereciveis.add(new Pereciveis("Creme de Leite Nestle",12.50,1));

        produtosNaoPereciveis.add(new NaoPereciveis("Geladeira", 2500, "Eletrodomestico"));
        produtosNaoPereciveis.add(new NaoPereciveis("Sofa", 1200, "Mobilia"));
        produtosNaoPereciveis.add(new NaoPereciveis("SmartTV Samsung NEO", 12000, "Eletrodomestico"));
        produtosNaoPereciveis.add(new NaoPereciveis("PlayStation", 4700, "Games"));
        produtosNaoPereciveis.add(new NaoPereciveis("Vassoura", 35, "Produtos de limpeza"));

        //calcula produtos pereciveis
        for (Pereciveis pereciveis : produtosPereciveis) {
             precoTotalPereciveis += pereciveis.calcular(1);
        }
        System.out.println("Preço total produtos perecíveis: " + precoTotalPereciveis);

        for (NaoPereciveis naoPereciveis : produtosNaoPereciveis) {
            precoTotalNaoPereciveis += naoPereciveis.calcular(1);
        }
        System.out.println("Preço total produtos não perecíveis: " + precoTotalNaoPereciveis);

    }
}
