package exercCorrida.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Corrida {
    float distancia, premioEmDolares;
    String nome;
    int numeroVeiculosPermitido;
    List<Veiculo> listaVeiculos = new ArrayList<>();

    SalvaVidasMoto salvaVidasMoto = new SalvaVidasMoto();
    SalvaVidasCarro salvaVidasCarro = new SalvaVidasCarro();

    public Corrida(float distancia, float premioEmDolares, String nome, int numeroVeiculosPermitido) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.numeroVeiculosPermitido = numeroVeiculosPermitido;
    }

    public void addCarro(float velocidade, float aceleracao, float anguloGiro, String placa){
        if (listaVeiculos.size() < this.numeroVeiculosPermitido ) {
            listaVeiculos.add(new Carro(velocidade, aceleracao, anguloGiro, placa));
        } else {
            System.out.printf("Veiculo com placa: %s, não foi adicionado pois a corrida já está cheia! \n", placa);
        }
    }

    public void addMoto(float velocidade, float aceleracao, float anguloGiro, String placa){
        if (this.numeroVeiculosPermitido < listaVeiculos.size()) {
            listaVeiculos.add(new Motocicleta(velocidade,aceleracao,anguloGiro,placa));
        } else {
            System.out.printf("Veiculo com placa: %s, não foi adicionado pois a corrida já está cheia! \n", placa);
        }
    }

    public void deleteVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }

    public void deleteVeiculoComPlaca(String placa){
        Veiculo veiculoEncontrado = listaVeiculos.stream()
                .filter(veiculo -> veiculo.getPlaca() == placa)
                .findFirst()
                .orElse(null);
        listaVeiculos.remove(veiculoEncontrado);
    }

    public void defineVencedor(){
         Veiculo veiculoVencedor = this.listaVeiculos.stream()
                .reduce((vencedor, novoVeiculo) -> {
                    if (this.calculaScoreIndividual(vencedor) > this.calculaScoreIndividual(novoVeiculo)){
                        return vencedor;
                    }
                    return novoVeiculo;
                }).get();
        System.out.printf("Vencedor da corrida: %s ", veiculoVencedor.getPlaca());
    }

    public double calculaScoreIndividual(Veiculo veiculo) {
        return (veiculo.getVelocidade() * (veiculo.getAceleracao() / 2)) /
        (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100));
    }

    public void socorrerCarro(String placa) {
        Carro veiculoEncontrado  = (Carro) listaVeiculos.stream()
                .filter(veiculo -> veiculo.getPlaca() == placa)
                .findFirst()
                .orElse(null);
        salvaVidasCarro.socorrer(veiculoEncontrado);
    }

    public void socorrerMoto(String placa) {
        Motocicleta veiculoEncontrado  = (Motocicleta) listaVeiculos.stream()
                .filter(veiculo -> veiculo.getPlaca() == placa)
                .findFirst()
                .orElse(null);
        salvaVidasMoto.socorrer(veiculoEncontrado);
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getPremioEmDolares() {
        return premioEmDolares;
    }

    public void setPremioEmDolares(float premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroVeiculosPermitido() {
        return numeroVeiculosPermitido;
    }

    public void setNumeroVeiculosPermitido(int numeroVeiculosPermitido) {
        this.numeroVeiculosPermitido = numeroVeiculosPermitido;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
}
