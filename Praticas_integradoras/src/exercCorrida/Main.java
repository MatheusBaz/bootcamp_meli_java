package exercCorrida;

import exercCorrida.modelo.Carro;
import exercCorrida.modelo.Corrida;
import exercCorrida.modelo.Motocicleta;

public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida(15,15000,"Corrida dos Alpes", 6);

        corrida.addCarro(120,50,30,"RWR4214");
        corrida.addCarro(150,30,35,"DEW3213");
        corrida.addCarro(280,60,66,"FGT3562");
        corrida.addCarro(240,80,45,"IKI4314");
        corrida.addMoto(90,30,55,"CVB3567");
        corrida.addMoto(350,80,15,"WQE2412");

        corrida.socorrerCarro("DEW3213");

        corrida.defineVencedor();
    }
}
