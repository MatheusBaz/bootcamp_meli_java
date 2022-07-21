package br.meli.perolaspraticaintegradora.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Joia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numeroIdentificacao;

    @Column(nullable = false)
    private String material;

    @Column(nullable = false)
    private double peso;

    @Column(nullable = false)
    private double quilates;
}
