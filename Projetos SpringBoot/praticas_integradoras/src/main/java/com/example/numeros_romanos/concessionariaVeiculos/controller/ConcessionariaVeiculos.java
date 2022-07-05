package com.example.numeros_romanos.concessionariaVeiculos.controller;

import com.example.numeros_romanos.concessionariaVeiculos.dto.VeiculoDTO;
import com.example.numeros_romanos.concessionariaVeiculos.model.Veiculo;
import com.example.numeros_romanos.concessionariaVeiculos.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class ConcessionariaVeiculos {
    @Autowired
    private VeiculoRepo repo;

    @GetMapping
    public List<VeiculoDTO> getAllVeiculo() {
        return repo.getAllVeiculo();
    }

    @PostMapping
    public ResponseEntity<String> addNewVeiculo(@RequestBody Veiculo veiculo) {
        if (repo.saveVeiculo(veiculo)) {
            return new ResponseEntity("Veiculo incluido!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Erro ao cadastrar veiculo", HttpStatus.BAD_REQUEST);
    }
}
