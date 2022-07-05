package com.example.numeros_romanos.concessionariaVeiculos.controller;

import com.example.numeros_romanos.concessionariaVeiculos.dto.VeiculoDTO;
import com.example.numeros_romanos.concessionariaVeiculos.model.Veiculo;
import com.example.numeros_romanos.concessionariaVeiculos.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
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

    @GetMapping("/{id}")
    public Veiculo getVeiculoById(@PathVariable int id) {
        return repo.getVeiculoById(id);
    }

    @GetMapping("/dates")
    public List<VeiculoDTO> getDateVeiculo(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime since,
                                           @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime to){
        return repo.getVeiculoByDate(since,to);
    }

    @GetMapping("/prices")
    public List<VeiculoDTO> getPriceVeiculo(@RequestParam double since, @RequestParam double to) {
        return repo.getVeiculoByPrice(since,to);
    }


}
