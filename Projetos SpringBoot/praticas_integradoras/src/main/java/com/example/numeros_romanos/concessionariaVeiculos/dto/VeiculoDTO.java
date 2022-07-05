package com.example.numeros_romanos.concessionariaVeiculos.dto;

import com.example.numeros_romanos.concessionariaVeiculos.model.Servico;
import com.example.numeros_romanos.concessionariaVeiculos.model.Veiculo;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class VeiculoDTO {
    private String marca, modelo, moedaCurrency;
    private int quilometrosRodados, portas, contadorVisitante;
    private Date dataManofatura;
    private double preco;

    public VeiculoDTO(Veiculo veiculo) {
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.moedaCurrency = veiculo.getMoedaCurrency();
        this.quilometrosRodados = veiculo.getQuilometrosRodados();
        this.portas = veiculo.getPortas();
        this.contadorVisitante = veiculo.getContadorVisitante();
        this.dataManofatura = veiculo.getDataManofatura();
        this.preco = veiculo.getPreco();
    }
}
