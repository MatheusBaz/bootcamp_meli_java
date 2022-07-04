package com.example.numeros_romanos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/codigo_morse")
public class CodigoMorse {

    @GetMapping("/{codigo}")
    public ResponseEntity<String> traduzCodigoMorse(@PathVariable String codigo) {
        Map<String, String> codMorse = new HashMap<>();
        codMorse.put(".-", "A");
        codMorse.put("-...", "B");
        codMorse.put("-.-.", "C");
        codMorse.put("-..", "D");
        codMorse.put(".", "E");
        codMorse.put("..-.", "F");
        codMorse.put("--.", "G");
        codMorse.put("....", "H");
        codMorse.put("..", "I");
        codMorse.put(".---", "J");
        codMorse.put("-.-", "K");
        codMorse.put(".-..", "L");
        codMorse.put("--", "M");
        codMorse.put("-.", "N");
        codMorse.put("---", "O");
        codMorse.put(".--.", "P");
        codMorse.put("--.-", "Q");
        codMorse.put(".-.", "R");
        codMorse.put("...", "S");
        codMorse.put("-", "T");
        codMorse.put("..-", "U");
        codMorse.put("...-", "V");
        codMorse.put(".--", "W");
        codMorse.put("-..-", "Y");
        codMorse.put("-.--", "X");
        codMorse.put("--..", "Z");
        codMorse.put(".----", "1");
        codMorse.put("..---", "2");
        codMorse.put("...--", "3");
        codMorse.put("....-", "4");
        codMorse.put(".....", "5");
        codMorse.put("-....", "6");
        codMorse.put("--...", "7");
        codMorse.put("---..", "8");
        codMorse.put("----.", "9");
        codMorse.put("-----", "0");
        codMorse.put("..--..", "?");
        codMorse.put("-.-.--", "!");
        codMorse.put(".-.-.-", ".");
        codMorse.put("--..--", ",");

        String codMorseTraduzido = "";
        for (String cod: codigo.split(" ")) {
            if (codMorse.get(cod) != null){
                codMorseTraduzido += codMorse.get(cod);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Código morse não conhecido, desculpe!");
            }
        }

        return ResponseEntity.status(HttpStatus.OK).body(codMorseTraduzido);
    }
}
