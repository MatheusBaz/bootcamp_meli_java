package exercCorrida.modelo;

public abstract class Veiculo {
    float velocidade, aceleracao, anguloDeGiro, peso;
    int rodas;
    String placa;

    public Veiculo(float velocidade, float aceleracao, float anguloDeGiro, float peso, String placa, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.peso = peso;
        this.placa = placa;
        this.rodas = rodas;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(float aceleracao) {
        this.aceleracao = aceleracao;
    }

    public float getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(float anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", peso=" + peso +
                ", placa='" + placa + '\'' +
                ", rodas='" + rodas + '\'' +
                '}';
    }
}
