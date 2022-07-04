package com.example.numeros_romanos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/converte_numero")
public class NumerosRomanos {

    @GetMapping("/{numeroDecimal}")
    public String converteParaNumRomano(@PathVariable int numeroDecimal) {
        int[] numDecimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        String numeroRomanoRetornado = "";

        if (numeroDecimal <= 0) {
            return "Não existe numero menor ou igual a zero em numeros romanos";
        }
        if (numeroDecimal > 3999) {
            return "Desculpa, mas por limitações visuais não é possível calcular numeros maiores que 3999!";
        }
        while(numeroDecimal > 0) {
            if (numeroDecimal >= numDecimal[i]) {
                numeroRomanoRetornado += " " + numRomanos[i];
                numeroDecimal -= numDecimal[i];
            } else {
                i += 1;
            }
        }
        return numeroRomanoRetornado;
    }
}

