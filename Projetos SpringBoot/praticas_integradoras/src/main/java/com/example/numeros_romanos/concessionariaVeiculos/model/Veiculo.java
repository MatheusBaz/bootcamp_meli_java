package com.example.numeros_romanos.concessionariaVeiculos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    private String marca, modelo, moedaCurrency;
    private int quilometrosRodados, portas, contadorVisitante;
    private LocalDateTime dataManofatura;
    private double preco;
    private List<Servico> servicos;

    public void incrementaContadorVisitas() {
        this.contadorVisitante += 1;
    }
}
