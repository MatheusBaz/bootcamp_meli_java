package praticaIntegradora01;

public class PraticaIntegradora01 {

    public static void main(String[] args) {
        String[] arrayCidade = {
                "Londres","Madrid","Nueva York","Buenos Aires", "Asunción", "São Paulo",
                "Lima","Santiado de Chile", "Lisboa", "Tokio"
        };
        float[][] matrizTemperaturas = new float[][] {
                {-2,-2,-8,4,6,5,0,-7,-1,-10},
                {33,32,27,37,42,43,39,26,31,35}
        };

        float minima = matrizTemperaturas[0][0];
        float maxima = matrizTemperaturas[1][0];
        String cidadeMinima = "";
        String cidadeMaxima = "";

        for (int x = 0; x < 2; x++) { // linhas / se x = 0 -> minima, se x = 1 -> maxima
            for (int y = 0; y < 10; y++) { // colunas
                if (matrizTemperaturas[0][y] < minima) {
                    minima = matrizTemperaturas[0][y];
                    cidadeMinima = arrayCidade[y];
                }
                if (matrizTemperaturas[1][y] > maxima) {
                    maxima = matrizTemperaturas[1][y];
                    cidadeMaxima = arrayCidade[y];
                }
            }
        }
        System.out.println("A cidade " + cidadeMaxima + " ficou com a maxima de: " + maxima +
                " e " + cidadeMinima + " ficou com a mínima de: " + minima);
    }
}
