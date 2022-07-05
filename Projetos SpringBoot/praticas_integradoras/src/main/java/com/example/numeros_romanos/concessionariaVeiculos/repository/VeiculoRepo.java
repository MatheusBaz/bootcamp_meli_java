package com.example.numeros_romanos.concessionariaVeiculos.repository;

import com.example.numeros_romanos.concessionariaVeiculos.dto.VeiculoDTO;
import com.example.numeros_romanos.concessionariaVeiculos.model.Veiculo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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
        List<VeiculoDTO> veiculoDTOList = new ArrayList<>();

        for(Veiculo vei : this.listaVeiculos){
            vei.incrementaContadorVisitas();
            VeiculoDTO veiculoDTO = new VeiculoDTO(vei);
            veiculoDTOList.add(veiculoDTO);
        }

        return veiculoDTOList;
    }


}
