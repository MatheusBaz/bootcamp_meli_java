package exercCorrida.modelo;

public class Carro extends Veiculo{
    public Carro(float velocidade, float aceleracao, float anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, 1000, placa, 4);
    }
}
