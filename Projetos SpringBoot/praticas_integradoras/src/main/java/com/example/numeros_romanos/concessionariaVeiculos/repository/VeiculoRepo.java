package com.example.numeros_romanos.concessionariaVeiculos.repository;

import com.example.numeros_romanos.concessionariaVeiculos.dto.VeiculoDTO;
import com.example.numeros_romanos.concessionariaVeiculos.model.Veiculo;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class VeiculoRepo {
    List<Veiculo> listaVeiculos = new ArrayList<>();

    public boolean saveVeiculo (Veiculo veiculo) {
        try {
            this.listaVeiculos.add(veiculo);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public List<VeiculoDTO> getAllVeiculo() {
        return this.listaVeiculos.stream()
                .map(VeiculoDTO::new)
                .collect(Collectors.toList());
    }

    public List<VeiculoDTO> getVeiculoByDate(LocalDateTime since, LocalDateTime to) {
        return this.listaVeiculos.stream()
                .filter(x -> (x.getDataManofatura().isAfter(since)
                        && x.getDataManofatura().isBefore(to)) ||
                        (x.getDataManofatura().isEqual(since)
                         || x.getDataManofatura().isEqual(to))
                )
                .map(VeiculoDTO::new)
                .collect(Collectors.toList());
    }

    public List<VeiculoDTO> getVeiculoByPrice(double priceSince, double priceTo) {
        if (priceSince < priceTo) {
            throw new RuntimeException("Since não pode ser menor que to");
        }
        return this.listaVeiculos.stream()
                .filter(x -> x.getPreco() >= priceSince && x.getPreco() <= priceTo)
                .map(VeiculoDTO::new)
                .collect(Collectors.toList());
    }

    public Veiculo getVeiculoById(int id) {
        return this.listaVeiculos.get(id);
    }


}
