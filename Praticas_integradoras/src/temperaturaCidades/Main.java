package temperaturaCidades;

public class Main {

    public static void main(String[] args) {
        String[] arrayCidade = {
                "Londres","Madrid","Nueva York","Buenos Aires", "Asunción", "São Paulo",
                "Lima","Santiado de Chile", "Lisboa", "Tokio"
        };
        float[][] matrizTemperaturas = new float[][] {
                {-2,33}, {-2,32}, {-8,27}, {4,37}, {6,42}, {5,43}, {0,39}, {-7,26}, {-1,31}, {-10,35}
        };

        float temperaturaMinima = matrizTemperaturas[0][0];
        float temperaturaMaxima = matrizTemperaturas[1][0];
        String cidadeTemperaturaMinima = "";
        String cidadeTemperaturaMaxima = "";
        final int TEMP_MIN = 0;
        final int TEMP_MAX = 1;

        for (int x = 0; x < arrayCidade.length; x++) {
            if (matrizTemperaturas[x][TEMP_MIN] < temperaturaMinima) {
                temperaturaMinima = matrizTemperaturas[x][TEMP_MIN];
                cidadeTemperaturaMinima = arrayCidade[TEMP_MIN];
            }
            if (matrizTemperaturas[x][TEMP_MAX] > temperaturaMaxima) {
                temperaturaMaxima = matrizTemperaturas[x][TEMP_MAX];
                cidadeTemperaturaMaxima = arrayCidade[TEMP_MAX];
            }
        }

        System.out.println("A cidade " + cidadeTemperaturaMaxima + " ficou com a maxima de: " + temperaturaMaxima +
                " e " + cidadeTemperaturaMinima + " ficou com a mínima de: " + temperaturaMinima);
    }
}
