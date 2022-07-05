package com.example.numeros_romanos.concessionariaVeiculos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Servico {
    private Date data;
    private int quilometros;
    private String descricao;
}
